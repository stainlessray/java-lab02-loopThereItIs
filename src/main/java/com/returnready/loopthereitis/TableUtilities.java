package com.returnready.loopthereitis;

import java.util.ArrayList;
import java.util.ListIterator;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int width) {
        ArrayList<Integer> matrix = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        int valueCount = width * width;
        String d = "|";
        for (int i = 1; i <= width; i++) {
            indexes.add(i);
        }
        System.out.printf(String.valueOf(indexes));
        //System.out.println(d + width + d + "by" + d + width + d + "Small" + d + valueCount + d);
        return null;
    }

    public static String getLargeMultiplicationTable(int width) {
        ArrayList<Integer> matrix = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        int valueCount = width * width;
        String d = "|";
        //System.out.println(d + width + d + "by" + d + width + d + "Small" + d + valueCount + d);
        // loop 1 thru width writing each value to arraylist indexes
        for (int i = 1; i <= width; i++) {
            indexes.add(i);
        }
        System.out.printf(String.valueOf(indexes));
        return null;
    }


    public static String getMultiplicationTable(int width) {
        ArrayList<Integer> matrix = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        int valueCount = width * width;
        String d = "|";
        for (int i = 0; i <= width; ++i) {
            indexes.add(i);
            int j = 0;
            int myDigit = j * i;
            for (j = indexes.get(i); j <= width; ++j){
                if (i > 0){
                    System.out.printf("i" + i + "\n");
                    System.out.printf("j" + j + "\n");
                    myDigit = j * i;
                    // if myDigit > 1 write to array list
                    // array "i" naming
                    if (myDigit >=2) {
                        matrix.add(myDigit);
                        System.out.printf(" In Loop myDigit: " + myDigit + "\n");
                    }
                }
                // loop each value of indexes array (width) times
        // int pos = String.valueOf(indexes.indexOf(0));
        }
        System.out.printf("Out of loop myDigit: " + myDigit + "\n");

        }
        //System.out.println(d + width + d + "by" + d + width + d + "Full" + valueCount + d);
        //System.out.printf(String.valueOf(indexes + "\n"));
        System.out.printf(String.valueOf(indexes + "\n"));
        System.out.printf(String.valueOf(matrix + "\n"));
        return null;


    }

}


/*        int nextValue = pos;
        while (iterator.hasNext()) {
            if (nextValue > -1) {
                nextValue = (iterator.next());
                System.out.println("Value : " + (nextValue));
            } else {
                break;
            }
        }*/
