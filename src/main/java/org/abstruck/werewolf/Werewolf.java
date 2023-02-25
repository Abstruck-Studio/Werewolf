package org.abstruck.werewolf;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamUserStatsCallback;
import org.abstruck.werewolf.client.WidgetMain;
import org.abstruck.werewolf.core.io.DataReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.net.URL;

/**
 * @author Goulixiaoji
 */
public class Werewolf {
    public static final Logger LOGGER = LoggerFactory.getLogger(Werewolf.class);
    public static String[] ARGS;
    public static void main(String[] args) {
        ARGS = args;
        try {
            SteamAPI.loadLibraries();
            if (!SteamAPI.init()) {
                LOGGER.error("Steam can't init!");
            }
        } catch (SteamException e) {
            LOGGER.error(e.getClass().getName() + ": " + e.getMessage());
            return;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                WidgetMain.onClientInitialize(DataReader.class.getResource("clientConfig.json"));
            }
        });

        SteamAPI.shutdown();
    }
}