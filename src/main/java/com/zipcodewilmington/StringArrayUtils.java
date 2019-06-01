package com.zipcodewilmington;

import java.lang.StringBuilder;
import java.util.ArrayList;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int x = 0; x <= array.length; x++) {
            if (array[x] == value) {
                return true;
            }

        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        ArrayList<String> arr = new ArrayList<String>();
        for (int x = array.length - 1; x >= 0; x--) {
            arr.add(array[x]);
        }
        String[] e = new String[arr.size()];


        return arr.toArray(e);


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int x = 0;
        int y = array.length;
        for (x = 0; x < (y / 2); x++) {
            if (array[x] == array[y - 1])
                return true;
        }


        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String y = String.join(",", array).toUpperCase();


        for (Character x = 'A'; x <= 'Z'; x++) {
            if (!y.contains(x.toString())) {
                return false;
            }

        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int number = 0;
        for (int x = 0; x <= array.length - 1; x++) {
            if (array[x] == value) {
                number++;

            }
        }
        return number;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<String>();
        for (int x =0; x<array.length; x++){
            arr.add(array[x]);
        }
        arr.remove(valueToRemove);

        String[] e = new String[arr.size()];

        return arr.toArray(e);
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add(array[0]);
        for (int x=0; x<array.length-1; x++) {

            if (!(array[x] == array[x+1])){

                arr.add(array[x+1]);
            }
        }
        String [] e = new String [arr.size()];
        arr.toArray(e);
        return e;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList <String> arr = new ArrayList<> ();

       return null;

    }


}
