package com.buchristo.kataCollection.evenorodd;

public class EvenOrOddMultiplication {
    /* This kata is about multiplying a given number by eight if it is an even number and by nine otherwise. */
    public int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
