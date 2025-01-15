package backtracking;

/*
https://leetcode.com/problems/word-search/description/

Raj Kumar Boddupally created on 05/01/2025 inside the package - backtracing

Approach
initialize k = 1,
1. Iterate through arr and find the first char.
2. if first char found, call another method by passing the char index i j
3. while k < word length
    check (i<board.length && (board[i+1][j] == word.charAt[k] || board[i-1][j] == word.charAt[k])
            ||
           (j<board[[0].length && (board[i][j+1] == word.charAt[k] || board[i][j-1] == word.charAt[k])
    if false -> return;

4. return true


 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {

        char[] chars = word.toCharArray();
        boolean exist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == chars[0]) {
                    exist = exist(board, i, j, chars);
                    if (exist)
                        return exist;
                }
            }
        }
        return exist;
    }

    private boolean exist(char[][] board, int i, int j, char[] chars) {
        int k = 1;
        while (k < chars.length) {
            if (!((i < board.length - 1 && board[i + 1][j] == chars[k]) || (i > 0 && board[i - 1][j] == chars[k]) || ((j < board.length - 1 && board[i][j + 1] == chars[k]) || (j > 0 && board[i][j - 1] == chars[k])))){
                return false;
            }
           k++;
        }
        return true;
    }
}
