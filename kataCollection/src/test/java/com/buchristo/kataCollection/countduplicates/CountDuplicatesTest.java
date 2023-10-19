package com.buchristo.kataCollection.countduplicates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicatesTest {
    CountDuplicates countDuplicates = new CountDuplicates();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(0, "abcde"),
                Arguments.of(1, "abcdea"),
                Arguments.of( 1, "indivisIbilIty")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void duplicateCount(int expected, String input) {
        assertEquals(expected, countDuplicates.duplicateCount(input));
    }
}