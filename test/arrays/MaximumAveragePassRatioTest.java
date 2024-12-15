package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAveragePassRatioTest {
    MaximumAveragePassRatio maximumAveragePassRatio = new MaximumAveragePassRatio();

    @Test
    void maxAverageRatio() {
        int[][] classes = new int[][]{{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        assertEquals(maximumAveragePassRatio.maxAverageRatio(classes,extraStudents), 0.78333);

    }
}