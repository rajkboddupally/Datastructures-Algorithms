package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestDistancetoCharacterTest {
    ShortestDistancetoCharacter s = new ShortestDistancetoCharacter();

    @Test
    void shortestToChar() {
        String str = "loveleetcode";
        char c = 'e';
        int[] output = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        Assertions.assertArrayEquals(output, s.shortestToChar(str, c));
    }

    @Test
    void shortestToChar1() {
        String str = "aaab";
        char c = 'b';
        int[] output = {3, 2, 1, 0};
        Assertions.assertArrayEquals(output, s.shortestToChar(str, c));
    }

    @Test
    void shortestToChar2() {
        String str = "aaba";
        char c = 'b';
        int[] output = {2, 1, 0, 1};
        Assertions.assertArrayEquals(output, s.shortestToChar(str, c));
    }
}
