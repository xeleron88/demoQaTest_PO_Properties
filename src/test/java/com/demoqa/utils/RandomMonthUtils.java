package com.demoqa.utils;

import java.util.Random;

public class RandomMonthUtils {
    public static String randomMonth() {
        String[] month  = {"January", "February", "March", "April", "May", "June", "Jule", "August", "September", "October", "November", "December"};
        int rnd = new Random().nextInt(month.length);
        return month[rnd];
    }
}
