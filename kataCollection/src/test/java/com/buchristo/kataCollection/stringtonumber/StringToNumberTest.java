package com.buchristo.kataCollection.stringtonumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {
    StringToNumber stringToNumber = new StringToNumber();
    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(0, "0"),
                Arguments.of(-3, "-3"),
                Arguments.of(0, "asd")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void stringToNumber(int expected, String input) {
        assertEquals(expected, stringToNumber.stringToNumber(input));
    }
}