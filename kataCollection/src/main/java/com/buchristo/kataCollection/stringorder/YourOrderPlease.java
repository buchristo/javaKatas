package com.buchristo.kataCollection.stringorder;

import java.util.*;
import java.util.stream.Collectors;

public class YourOrderPlease {
    /* Your task is to sort a given string.
     Each word in the string will contain a single number.
     This number is the position the word should have in the result.

     Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers. */

    public String order(String words) {

        List<String> wordList = Arrays.asList(words.split(" "));
        Collections.sort(wordList, Comparator.comparing(this::extractInt));
        return wordList.stream().collect(Collectors.joining(" "));
    }

    private int extractInt(String s){
        String num = s.replaceAll("[^\\d.]", "");
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }
}
