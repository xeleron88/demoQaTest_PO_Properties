package com.demoqa.properties;

import static java.lang.System.getProperty;

public class Property {
    public static String browser() {
        return getProperty("browser", "chrome");
    }

    public static String browserSize() {
        return getProperty("browserSize", "1920x1080");
    }

    public static boolean isRemote() {
        return Boolean.parseBoolean(getProperty("remote", "false"));
    }
}
