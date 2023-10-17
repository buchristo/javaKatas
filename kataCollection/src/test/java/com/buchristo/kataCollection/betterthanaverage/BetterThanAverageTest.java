package com.buchristo.kataCollection.betterthanaverage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BetterThanAverageTest {
    BetterThanAverage betterThanAverage = new BetterThanAverage();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(true, new int[] {2, 3}, 5),
                Arguments.of(true, new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75),
                Arguments.of(false, new int[] {100, 90}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void betterThanAverage(boolean expected, int[] classPoints, int yourPoints) {
        assertEquals(expected, betterThanAverage.betterThanAverage(classPoints, yourPoints));
    }
}