package com.buchristo.kataCollection.oppositenumber;

public class OppositeNumber {
    /* Very simple, given an integer or a floating-point number, find its opposite. */

    public int opposite(int number){
        return number > 0 ? number - (number*2) :
                number < 0 ? number - (number*2) : 0;
    }
}
