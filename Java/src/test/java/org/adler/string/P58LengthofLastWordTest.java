package org.adler.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P58LengthofLastWordTest {

    @Test
    void testTwoWords() {
        assertEquals(5, P58LengthofLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    void testTrailingSpaces() {
        assertEquals(4, P58LengthofLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void testMultipleWords() {
        assertEquals(6, P58LengthofLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    void testSingleWord() {
        assertEquals(3, P58LengthofLastWord.lengthOfLastWord("abc"));
    }
}
