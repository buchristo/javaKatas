package com.buchristo.kataCollection.duplicateencoder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {

    DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("((((", "walk"),
                Arguments.of("", ""),
                Arguments.of("))))))", "Hannah")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void encode(String expected, String input) {
        assertEquals(expected, duplicateEncoder.encode(input));
    }
}