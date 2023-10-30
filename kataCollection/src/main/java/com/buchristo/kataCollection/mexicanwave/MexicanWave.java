package com.buchristo.kataCollection.mexicanwave;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    /* In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
     You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.

        1.  The input string will always be lower case but maybe empty.
        2.  If the character in the string is whitespace then pass over it as if it was an empty seat
     */

    public String[] wave(String str) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }
}
