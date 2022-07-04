package com.zipcodewilmington;

import java.util.*;

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
        boolean outcome = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                outcome = true;
                break;
            }
        }
        return outcome;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }


        return array;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean outcome = false;
        for (int i = 0; i < array.length / 2; i++) {
            {
                if (array[i] == array[array.length - 1 - i]) {
                    outcome = true;
                    break;
                }
            }

        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        //not passing

        boolean outcome = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "a") {
                outcome = true;
                break;
            }
        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                occurrences += 1;
            }

        }
        return occurrences;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> st = new ArrayList<>();

        String[] results = new String[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] != valueToRemove) {
                st.add(array[i]);
            }

        }
        return st.toArray(results);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> st2 = new ArrayList<>();
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] != array[i + 1]) {
                st2.add(array[i]);
            }
        }
        st2.add(array[array.length-1]);

        String[] results = new String[st2.size()];
        st2.toArray(results);
        System.out.println(Arrays.toString(results));
        return results;
    }


//        ArrayList<String> st = new ArrayList<>();
//
//        String[] results = new String[0];
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[i] != array[j]) {
//                    st.add(array[i]);
//                }
//
//            }
//
//        }
//        return st.toArray(results);
//    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String emp = "";
        ArrayList<String> st2 = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                st2.add(array[i]);
            }
        }
        String[] results = new String[st2.size()];
        st2.toArray(results);
        System.out.println(Arrays.toString(results));
        return (st2.toArray(results));
    }


//            for (int j = 1; j < array.length; j++) {
//                while (array[i] == array[j]) {
//                    emp = emp + array[i];
//                    i++;
//                    j++;
//                    if (array[j] != array[j+1] && j+1 == array.length){
//                        emp = emp + array[j];
//                    }
//                    if (j + 1 == array.length){
//                        break;
//                    }
//                }st.add(emp);
//                emp = "";
//            }
//        } String[] results = new String [st.size()];
//        st.toArray(results);
//        System.out.println(Arrays.toString(results));}


}