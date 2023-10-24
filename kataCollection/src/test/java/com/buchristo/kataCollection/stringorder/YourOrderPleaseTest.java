package com.buchristo.kataCollection.stringorder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class YourOrderPleaseTest {
    YourOrderPlease yourOrderPlease = new YourOrderPlease();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("Thi1s is2 3a T4est", "is2 Thi1s T4est 3a"),
                Arguments.of("Fo1r the2 g3ood 4of th5e pe6ople", "4of Fo1r pe6ople g3ood th5e the2"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void order(String expected, String input) {
        assertEquals(expected, yourOrderPlease.order(input));
    }
}