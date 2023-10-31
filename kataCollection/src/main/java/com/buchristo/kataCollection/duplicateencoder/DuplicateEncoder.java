package com.buchristo.kataCollection.duplicateencoder;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateEncoder {

    /* The goal of this exercise is to convert a string to a new string where each character in the new string is "("
     if that character appears only once in the original string, or ")"
     if that character appears more than once in the original string.
     Ignore capitalization when determining if a character is a duplicate.
     */

    public String encode(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
