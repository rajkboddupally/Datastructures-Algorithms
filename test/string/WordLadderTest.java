package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordLadderTest {
    WordLadder wordLadder;

    @BeforeEach
    void setUp() {
        wordLadder = new WordLadder();
    }

    @Test
    void ladderLength() {
        String begin = "hit";
        String end = "cog";
        String[] data = {"hot", "dot", "dog", "lot", "log", "cog"};
        Assertions.assertEquals(5, wordLadder.ladderLength(begin, end, Arrays.asList(data)));
    }
}
