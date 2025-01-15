package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    WordSearch w = new WordSearch();

    @Test
    void exist() {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        assertTrue(w.exist(board, word));
    }
}