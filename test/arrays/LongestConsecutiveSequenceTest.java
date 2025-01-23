package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l = new LongestConsecutiveSequence();

    @Test
    void longestConsecutive() {
        int[] nums = new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        assertEquals(7, l.longestConsecutive(nums));
    }
}