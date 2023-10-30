package com.buchristo.kataCollection.mexicanwave;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MexicanWaveTest {
    MexicanWave mexicanWave = new MexicanWave();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new String[]{ "Hello", "hEllo", "heLlo", "helLo", "hellO" }, "hello"),
                Arguments.of(new String[]{ " Gap ", " gAp ", " gaP " }, " gap ")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void wave(String[] expected, String input) {
        assertEquals(Arrays.toString(expected), Arrays.toString(mexicanWave.wave(input)));
    }
}