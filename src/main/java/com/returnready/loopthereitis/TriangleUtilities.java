package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String concatLine = "";
        int j;
        for (int i = 1; i <= numberOfRows; i++) {
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
        return concatLine.substring(1);
    }

    public static String getRow(int numberOfRows) {
        String concatLine = "";
        for (int i = 1; i <= 20; i++) {
            concatLine = concatLine += "*";
        }
        return concatLine;
    }

    public static String getSmallTriangle(int numberOfRows) {
        String concatLine = "";
        int j;
        for (int i = 1; i <= numberOfRows; i++) {
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
        return concatLine.substring(1);
    }


    public static String getLargeTriangle(int numberOfRows) {
        String concatLine = "";
        int j;
        for (int i = 1; i <= numberOfRows; i++) {
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
        return concatLine.substring(1);

    }
}