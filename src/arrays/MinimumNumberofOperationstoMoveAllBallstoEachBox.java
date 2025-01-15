package arrays;

/*
https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description


Raj Kumar Boddupally created on 06/01/2025 inside the package - arrays

 */
/*
    Approach
        1. Initiate ballsToLeft, movesToLeft, = 0; Initiate result array of size n
        2. Iterate n -
 */
public class MinimumNumberofOperationstoMoveAllBallstoEachBox {

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ballsToLeft = 0, movesToLeft = 0, ballsToRight = 0, movesToRight = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;

            int j = n - 1 - i;
            result[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }

        return result;
    }
}
