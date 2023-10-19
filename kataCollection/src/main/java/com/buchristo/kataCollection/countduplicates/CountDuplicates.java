package com.buchristo.kataCollection.countduplicates;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicates {
    /*Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
    */

    public int duplicateCount(String text) {

        int duplicates = 0;
        List<String> characters = List.of(text.toUpperCase().split(""));
        Map<String, Long> countedChars = characters.stream()
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
        for (Long value : countedChars.values()) {
            if(value > 1){
                duplicates += 1;
            }
        }
        return duplicates;
    }
}
