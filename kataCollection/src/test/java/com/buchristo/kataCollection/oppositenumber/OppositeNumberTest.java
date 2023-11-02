package com.buchristo.kataCollection.oppositenumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {
    OppositeNumber oppositeNumber = new OppositeNumber();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(-3, 3),
                Arguments.of(0, 0),
                Arguments.of(5, -5),
                Arguments.of(-123, 123),
                Arguments.of(123, -123)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void opposite(int expected, int input) {
        assertEquals(expected, oppositeNumber.opposite(input));
    }
}