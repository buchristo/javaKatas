package com.buchristo.kataCollection.inttoip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IntToIpv4Test {
    IntToIpv4 intToIpv4 = new IntToIpv4();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("0.0.0.0", 0),
                Arguments.of("128.32.10.1", 2149583361L)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void longToIP(String expected, long input) {
        assertEquals(expected, intToIpv4.longToIP(input));
    }
}