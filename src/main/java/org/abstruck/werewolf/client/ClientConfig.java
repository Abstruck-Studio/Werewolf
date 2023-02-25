package org.abstruck.werewolf.client;

/**
 * @author Goulixiaoji
 */
public class ClientConfig {
    private String widgetName = "Werewolf";
    private int width = 720;
    private int height = 360;
    private boolean isFullScreen = false;

    public String getWidgetName() {
        return widgetName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFullScreen() {
        return isFullScreen;
    }
}
