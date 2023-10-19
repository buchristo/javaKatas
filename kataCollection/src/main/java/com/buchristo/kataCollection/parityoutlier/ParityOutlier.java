package com.buchristo.kataCollection.parityoutlier;

import java.util.ArrayList;
import java.util.List;

public class ParityOutlier {
    /*
     https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
     You are given an array (which will have a length of at least 3, but could be very large) containing integers.
     The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
     Write a method that takes the array as an argument and returns this "outlier" N.
     */

    public int find(int[] integers) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        return evenNumbers.size() < oddNumbers.size() ? evenNumbers.get(0) : oddNumbers.get(0);
    }
}
