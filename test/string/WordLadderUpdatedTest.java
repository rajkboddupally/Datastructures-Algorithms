package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordLadderUpdatedTest {
    WordLadderUpdated wordLadder;

    @BeforeEach
    void setUp() {
        wordLadder = new WordLadderUpdated();
    }

    @Test
    void ladderLength() {
        String begin = "hit";
        String end = "cog";
        String[] data = {"hot", "dot", "dog", "lot", "log", "cog"};
        Assertions.assertEquals(5, wordLadder.ladderLength(begin, end, Arrays.asList(data)));
    }

    @Test
    void ladderLength1() {
        String begin = "hot";
        String end = "dog";
        String[] data = {"hot", "dog"};
        Assertions.assertEquals(0, wordLadder.ladderLength(begin, end, Arrays.asList(data)));
    }
}
