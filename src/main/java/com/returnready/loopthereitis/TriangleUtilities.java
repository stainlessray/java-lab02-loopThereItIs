package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String concatLine = "";
        int j;
        for (int i = 1; i <=  numberOfRows; i ++) {
            if (i >= 1) {
                for (j = 1; j <= i; j++) {
                    if (j >= i) {
                        concatLine = String.format(concatLine += "\n");
                    } else {
                        concatLine = concatLine += "*";
                    }
                }
            }

        }
        System.out.println(concatLine);

        return concatLine.substring(1);
    }

    public static String getRow(int numberOfStars) {
        String concatLine = "";
        for (int i = 1; i <= 20; i++) {
            concatLine = concatLine += "*";
        }
        return concatLine;
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
