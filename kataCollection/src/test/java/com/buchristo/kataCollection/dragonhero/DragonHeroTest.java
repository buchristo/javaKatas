package com.buchristo.kataCollection.dragonhero;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DragonHeroTest {
DragonHero dragonHero = new DragonHero();
    @ParameterizedTest
    @CsvSource( value = {
            "true:10:5",
            "true:100:40",
            "false:4:5",
            "false:1500:751",
            "false:0:1"
    }, delimiter = ':'
    )
    void hero(boolean expected, int bullets, int dragons) {
        assertEquals(expected, dragonHero.hero(bullets, dragons));
    }
}