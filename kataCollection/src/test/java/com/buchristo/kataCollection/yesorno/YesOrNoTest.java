package com.buchristo.kataCollection.yesorno;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {
    YesOrNo yesOrNo = new YesOrNo();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("Yes", true),
                Arguments.of("No", false)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void boolToWord(String expected, boolean input) {
        assertEquals(expected, yesOrNo.boolToWord(input));
    }
}