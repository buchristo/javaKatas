package com.buchristo.kataCollection.tocamelcase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseConverter {
    /* Complete the method/function so that it converts dash/underscore delimited words into camel casing.
     The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
      also often referred to as Pascal case). The next words should be always capitalized.

        "the-stealth-warrior" gets converted to "theStealthWarrior"

        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

        "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
     */

    public String toCamelCase(String s) {
        String[] strings = s.split("[-_]");
        return Arrays.stream(strings)
                .limit(1)
                .collect(Collectors.joining())
                +
                Arrays.stream(strings)
                        .skip(1)
                        .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                        .collect(Collectors.joining());
    }
}
