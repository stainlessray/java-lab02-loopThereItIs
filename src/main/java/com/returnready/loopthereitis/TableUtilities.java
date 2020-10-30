package com.returnready.loopthereitis;

import java.util.ArrayList;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int width) {
        int valueCount = width*width;
        String d = "|";
        System.out.println(d + width + d + "by" + d + width + d + "Small" + d + valueCount + d);
        return null;
    }

    public static String getLargeMultiplicationTable(int width) {
        ArrayList<Integer> rows = new ArrayList<>();
        int valueCount = width * width;
        String d = "|";

    }


    public static String getMultiplicationTable(int width) {
        int valueCount = width*width;
        String d = "|";
        System.out.println(d + width + d + "by" + d + width + d + "Full" + valueCount + d);
        return null;
    }
}
