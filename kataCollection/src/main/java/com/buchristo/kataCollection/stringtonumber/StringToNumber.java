package com.buchristo.kataCollection.stringtonumber;

public class StringToNumber {
    /*We need a function that can transform a string into a number. What ways of achieving this do you know?
    Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.*/

    public int stringToNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }
}
