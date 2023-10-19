package com.buchristo.kataCollection.parityoutlier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParityOutlierTest {
    ParityOutlier parityOutlier = new ParityOutlier();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(12, new int[]{1,3,12,5,7,9}),
                Arguments.of(3, new int[]{2,12,16,3,20,40})
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void find(int expected, int[] input) {
        assertEquals(expected, parityOutlier.find(input));
    }
}