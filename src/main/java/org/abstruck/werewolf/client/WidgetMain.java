package org.abstruck.werewolf.client;

import com.google.gson.Gson;
import org.abstruck.werewolf.core.io.DataReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

/**
 * @author Goulixiaoji
 */
public class WidgetMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(WidgetMain.class);
    public static void onClientInitialize(URL configUrl) {

        JFrame frame = new JFrame("Werewolf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(720, 360);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        LOGGER.info("Opening Widget...");
        frame.pack();
        frame.setVisible(true);

    }
}
