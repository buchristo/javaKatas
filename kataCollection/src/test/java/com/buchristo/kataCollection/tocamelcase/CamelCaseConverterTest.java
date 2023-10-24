package com.buchristo.kataCollection.tocamelcase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseConverterTest {
    CamelCaseConverter camelCaseConverter = new CamelCaseConverter();

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("theStealthWarrior", "the_Stealth_Warrior"),
                Arguments.of("theStealthWarrior", "the-Stealth-Warrior"),
                Arguments.of("TheStealthWarrior", "The_Stealth-warrior"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void toCamelCase(String expected, String input) {
        assertEquals(expected, camelCaseConverter.toCamelCase(input));
    }
}