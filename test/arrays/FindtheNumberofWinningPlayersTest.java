package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindtheNumberofWinningPlayersTest {
    FindtheNumberofWinningPlayers f = new FindtheNumberofWinningPlayers();
    @Test
    void winningPlayerCount() {
        int[][] nums = new int[][]{{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};
        int input = 5, output = 2;
        assertEquals(output, f.winningPlayerCount(input, nums));
    }

    @Test
    void winningPlayerCount_1() {
        int[][] nums = new int[][]{{0,8},{0,3}};
        int input = 2, output = 1;
        assertEquals(output, f.winningPlayerCount(input, nums));
    }
}