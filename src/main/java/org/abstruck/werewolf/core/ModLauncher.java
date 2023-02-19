package org.abstruck.werewolf.core;

import com.google.gson.Gson;
import org.abstruck.werewolf.Werewolf;
import org.abstruck.werewolf.core.io.DataReader;
import org.abstruck.werewolf.core.mods.ModData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Goulixiaoji
 */
public class ModLauncher {
   public static final Map<String, ModData> MODS_MAP = new HashMap<>();
   public static final Map<String, URL> MODS_URLS = new HashMap<>();
   private static final Logger LOGGER = LoggerFactory.getLogger(ModLauncher.class);

   public static boolean loadMod(URL url) {
       try {
           URLClassLoader myClassLoader = new URLClassLoader(
                   new URL[] { url }, Thread.currentThread().getContextClassLoader()
           );
           URL resourceUrl = myClassLoader.findResource("werewolf.mods.json");

           String modDataString = DataReader.readJarFile(resourceUrl);
           Gson gson = new Gson();
           ModData data = gson.fromJson(modDataString, ModData.class);
           String id = data.getId();
           String name = data.getName();
           if (!MODS_MAP.containsKey(id)) {
               MODS_MAP.put(id, data);
               MODS_URLS.put(id, url);
           }
           else {
               LOGGER.error(name + "(" + id + ")" + " Loaded Twice!");
           }
       } catch (IOException e) {
           LOGGER.error(e.getClass().getName() + ": " + e.getMessage());
           return false;
       }
       return true;
   }

   public static void initializeMod(String id) {
       try {
           URL url = MODS_URLS.get(id);
           ModData data = MODS_MAP.get(id);
           URLClassLoader myClassLoader = new URLClassLoader(
               new URL[] { url }, Thread.currentThread().getContextClassLoader()
           );
           Class<?> klass =
                   myClassLoader.loadClass(data.getEntryPoints().getInit());
           if (klass.getDeclaredConstructor().newInstance() instanceof  ModInitialize modInitialize) {
               modInitialize.oninitialize(Werewolf.ARGS);
           }
           else {
               LOGGER.error(data.getEntryPoints().getInit() + "  is not a subclass of " + ModInitialize.class.getName());
           }
       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
           LOGGER.error(e.getClass().getName() + ": " + e.getMessage());
       }
   }
}
