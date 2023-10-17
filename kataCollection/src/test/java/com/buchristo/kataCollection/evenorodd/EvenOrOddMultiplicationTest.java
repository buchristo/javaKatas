package com.buchristo.kataCollection.evenorodd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddMultiplicationTest {
    EvenOrOddMultiplication evenOrOddMultiplication = new EvenOrOddMultiplication();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(16, 2),
                Arguments.of(0, 0),
                Arguments.of(27, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void simpleMultiplication(int expected, int input) {
        assertEquals(expected, evenOrOddMultiplication.simpleMultiplication(input));
    }
}