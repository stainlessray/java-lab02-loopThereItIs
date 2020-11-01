package com.returnready.loopthereitis;

import java.util.ArrayList;
import java.util.ListIterator;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int width) {
        ArrayList<Integer> indexes = new ArrayList<>();
        String concatLine = "";
        for (int i = 0; i <= width; ++i) {
            if (i >= 0) {
                indexes.add(i);}
            int j = 0;
            int myDigit;
            for (j = indexes.get(0); j <= width; j++) {
                if (j > 0) {
                    myDigit = j * i;
                    if (myDigit >= 1) {
                        concatLine = String.format(concatLine + "%3d |", myDigit);
                        if (j == width) {
                            concatLine = concatLine + "\n";
                        }
                    }
                }
            }
        }
        return concatLine;
    }

    public static String getLargeMultiplicationTable(int width) {
        ArrayList<Integer> indexes = new ArrayList<>();
        String concatLine = "";
        for (int i = 0; i <= width; ++i) {
            if (i >= 0) {
                indexes.add(i);}
            int j = 0;
            int myDigit;
            for (j = indexes.get(0); j <= width; j++) {
                if (j > 0) {
                    myDigit = j * i;
                    if (myDigit >= 1) {
                        concatLine = String.format(concatLine + "%3d |", myDigit);
                        if (j == width) {
                            concatLine = concatLine + "\n";
                        }
                    }
                }
            }
        }
        return concatLine;
    }



    public static String getMultiplicationTable(int width) {
        ArrayList<Integer> indexes = new ArrayList<>();
        String concatLine = "";
        for (int i = 0; i <= width; ++i) {
            if (i >= 0) {
                indexes.add(i);}
            int j = 0;
            int myDigit;
            for (j = indexes.get(0); j <= width; j++) {
                if (j > 0) {
                    myDigit = j * i;
                    if (myDigit >= 1) {
                        concatLine = String.format(concatLine + "%3d |", myDigit);
                        if (j == width) {
                            concatLine = concatLine + "\n";
                        }
                    }
                }
            }
        }
        return concatLine;
    }
}



