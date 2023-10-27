package com.buchristo.kataCollection.pokerhand;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PokerhandisflushTest {
    Pokerhandisflush pokerhandisflush = new Pokerhandisflush();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(true, new String[]{"AS", "3S", "9S", "KS", "4S"}),
                Arguments.of(false, new String[]{"AD", "4S", "7H", "KC", "5S"}),
                Arguments.of(false, new String[]{"AD", "4S", "10H", "KC", "5S"}),
                Arguments.of(true, new String[]{"QD", "4D", "10D", "KD", "5D"}),
                Arguments.of(false, new String[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void checkIfFlush(boolean expected, String[] input) {
        assertEquals(expected, pokerhandisflush.CheckIfFlush(input));
    }
}