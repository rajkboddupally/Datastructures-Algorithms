package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheFirstPlayertowinKGamesinaRowTest {
    FindTheFirstPlayertowinKGamesinaRow f = new FindTheFirstPlayertowinKGamesinaRow();

    @Test
    void findWinningPlayer() {
        int[] skills = new int[]{4,2,6,3,9};
        assertEquals(2, f.findWinningPlayer(skills, 2));
    }

    @Test
    void findWinningPlayer2() {
        int[] skills = new int[]{2,5,4};
        assertEquals(1, f.findWinningPlayer(skills, 3));
    }

    @Test
    void findWinningPlayer3() {
        int[] skills = new int[]{16,4,7,17};
        assertEquals(3, f.findWinningPlayer(skills, 562084119));
    }
}