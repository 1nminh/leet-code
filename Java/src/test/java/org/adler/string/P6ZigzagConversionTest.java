package org.adler.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P6ZigzagConversionTest {

    @Test
    void testThreeRows() {
        assertEquals("PAHNAPLSIIGYIR", P6ZigzagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    void testFourRows() {
        assertEquals("PINALSIGYAHRPI", P6ZigzagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    void testSingleRow() {
        assertEquals("A", P6ZigzagConversion.convert("A", 1));
    }

    @Test
    void testTwoRows() {
        assertEquals("PYAIHRNAPLSIIG", P6ZigzagConversion.convert("PAYPALISHIRING", 2));
    }
}
