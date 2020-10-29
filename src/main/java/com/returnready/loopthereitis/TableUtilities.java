package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int width) {
        int valueCount = width*width;
        String d = "|";
        System.out.println(d + width + d + "by" + d + width + d + "Small" + d + valueCount + d);
        return null;
    }

    public static String getLargeMultiplicationTable(int width) {
        int valueCount = width * width;
        String d = "|";
        String concString = "";
        int row;
        for (row = 1; row <= width; row++) {
            for (int i = row; i <= width; i = ++row) {
                concString = concString + i;
            }
        System.out.println(concString);

        }

        //System.out.println(d + width + d + "by" + d + width + d + "Large" + valueCount + d);
        return d;
    }

    public static String getMultiplicationTable(int width) {
        int valueCount = width*width;
        String d = "|";
        System.out.println(d + width + d + "by" + d + width + d + "Full" + valueCount + d);
        return null;
    }
}
