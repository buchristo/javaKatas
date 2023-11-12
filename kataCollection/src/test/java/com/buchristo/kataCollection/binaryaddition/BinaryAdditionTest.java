package com.buchristo.kataCollection.binaryaddition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdditionTest {

    BinaryAddition binaryAddition = new BinaryAddition();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("10", 1, 1),
                Arguments.of("1", 0, 1),
                Arguments.of("1", 1, 0),
                Arguments.of("100", 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void binaryAddition(String expected, int a, int b) {
        assertEquals(expected, binaryAddition.binaryAddition(a,b));
    }
}