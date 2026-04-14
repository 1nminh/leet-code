package org.adler.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P12IntegerToRomanTest {

    @Test
    void testSmallNumber() {
        assertEquals("III", P12IntegerToRoman.intToRoman(3));
    }

    @Test
    void testMediumNumber() {
        assertEquals("LVIII", P12IntegerToRoman.intToRoman(58));
    }

    @Test
    void testSubtractiveCases() {
        assertEquals("MCMXCIV", P12IntegerToRoman.intToRoman(1994));
    }

    @Test
    void testOne() {
        assertEquals("I", P12IntegerToRoman.intToRoman(1));
    }

    @Test
    void testLargeNumber() {
        assertEquals("MMMCMXCIX", P12IntegerToRoman.intToRoman(3999));
    }
}
