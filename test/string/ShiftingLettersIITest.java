package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftingLettersIITest {
    ShiftingLettersII sh = new ShiftingLettersII();

    @Test
    void shiftingLetters() {
        String s = "abc";
        int[][] shifts = new int[][]{{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        assertEquals("ace", sh.shiftingLetters(s, shifts));
    }

    @Test
    void shiftingLetters1() {
        String s = "dztz";
        int[][] shifts = new int[][]{{0, 0, 0}, {1, 1, 1}};
        assertEquals("catz", sh.shiftingLetters(s, shifts));
    }
}