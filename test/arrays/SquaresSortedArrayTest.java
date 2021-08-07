package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquaresSortedArrayTest {
    SquaresSortedArray s;

    @BeforeEach
    void setUp() {
        s = new SquaresSortedArray();

    }

    @Test
    void sortedSquares() {

        int[] arr = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};
        Assertions.assertArrayEquals(output, s.sortedSquares(arr));
    }

    @Test
    void sortedSquares2() {

        int[] arr = {-7, -3, 2, 3, 11};
        int[] output = {4, 9, 9, 49, 121};
        Assertions.assertArrayEquals(output, s.sortedSquares(arr));
    }
}
