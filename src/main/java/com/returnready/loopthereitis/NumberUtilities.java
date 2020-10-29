package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String tempString;
        tempString = "";
        for (int j = start; j < stop; j++) {
            if ( j % 2 != 0 ) {
                tempString = tempString + j;
            }
        }
        return tempString;
    }


    public static String getOddNumbers(int start, int stop, int step) {
        String tempString;
        tempString = "";
        for (int j = start; j < stop; j++) {
            if ( j % 2 == 0 ) {
                tempString = tempString + j;
            }
        }
        return tempString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        return "test" + start;
    }

    public static String getRange(int stop) {
        //
        String tempString;
        tempString = "";
        for (int i = 0; i < stop; i++) {
            tempString = tempString + i ;
        }
        return tempString;
    }

    public static String getRange(int start, int stop) {
        String tempString;
        tempString = "";
        for (int j = start; j < stop; j++) {
            tempString = tempString + j ;
        }
        //System.out.println(tempString.length()/3);
        return tempString;

    }


    public static String getRange(int start, int stop, int step) {
        String tempString;
        tempString = "";
        // stop = stop minus step
        for (int i = start; i < stop; i += step) {
        tempString = tempString + i ;
        }
        System.out.println(tempString.length()/10);
        return tempString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
