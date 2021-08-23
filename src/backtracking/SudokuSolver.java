package backtracking;

/* Raj Kumar Boddupally created on 8/23/2021 inside the package - backtracking */

/*
Sudoku is 9*9 2 dimensional array
Each row and column should have number from 1-9 non repeated.
Also each sub matrix 3*3 should have number from 1-9 non repeated.

######################
Backtracking approach
######################
1. Iterate through array. Rows and Columns
2. If the given element at array[row][col] is 0 or blank, then
3. Assign the value from 1-9 to array[row][col]
4. validate if the sudoku rule breaks due to above assignment #3
5. If No, continue
6. If Yes, increment #3 and perform #4. #5, #6
7. If #3 reached 9, then increment previous number and repeat.
8. Return the status

 */


import java.util.stream.IntStream;

public class SudokuSolver {
    private static int counter = 0;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;
    private static final int START_INDEX = 0;

    public static void main(String[] args) {
        int[][] board = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };
        solve(board);
        printBoard(board);
    }

    private static void printBoard(int[][] board) {
        for (int row = START_INDEX; row < MAX_VALUE; row++) {
            for (int col = START_INDEX; col < MAX_VALUE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("counter " + counter);
    }

    private static boolean solve(int[][] board) {
        for (int row = START_INDEX; row < MAX_VALUE; row++) {
            for (int col = START_INDEX; col < MAX_VALUE; col++) {
                if (board[row][col] == 0) {
                    for (int k = MIN_VALUE; k <= MAX_VALUE; k++) {
                        board[row][col] = k;
                        if (validate(board, row, col) && solve(board)) {
                            return true;
                        }
                        board[row][col] = 0;
                        counter++;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validate(int[][] board, int row, int col) {
        return rowValidate(board, row) && colValidate(board, col) && subMatrixValidate(board, row, col);
    }

    private static boolean subMatrixValidate(int[][] board, int row, int col) {
        int subMatrixRowStartIndex = (row / 3) * 3;
        int subMatrixRowEndIndex = subMatrixRowStartIndex + 3;
        int subMatrixColStartIndex = (col / 3) * 3;
        int subMatrixColEndIndex = subMatrixColStartIndex + 3;

        boolean[] checkMatrix = new boolean[MAX_VALUE];

        for (int i = subMatrixRowStartIndex; i < subMatrixRowEndIndex; i++) {
            for (int j = subMatrixColStartIndex; j < subMatrixColEndIndex; j++) {
                if (!checkValid(board, i, j, checkMatrix))
                    return false;
            }
        }
        return true;
    }

    private static boolean colValidate(int[][] board, int col) {
        boolean[] isInvalidRow = new boolean[MAX_VALUE];
        return IntStream.range(START_INDEX, MAX_VALUE).allMatch((row) -> checkValid(board, row, col, isInvalidRow));
    }

    private static boolean rowValidate(int[][] board, int row) {
        boolean[] isInvalidRow = new boolean[MAX_VALUE];
        return IntStream.range(START_INDEX, MAX_VALUE).allMatch((col) -> checkValid(board, row, col, isInvalidRow));
    }

    private static boolean checkValid(int[][] board, int row, int col, boolean[] isInvalidRow) {
        if (board[row][col] != 0) {
            if (isInvalidRow[board[row][col] - 1])
                return false;
            else
                isInvalidRow[board[row][col] - 1] = true;
        }
        return true;
    }
}
