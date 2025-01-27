package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    TrappingRainWater t = new TrappingRainWater();

    @Test
    void trap1() {
        int[] input = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, t.trap(input));
    }

    @Test
    void trap2() {
        int[] input = new int[]{4, 2, 0, 3, 2, 5};
        assertEquals(9, t.trap(input));
    }

    @Test
    void trap3() {
        int[] input = new int[]{4, 1, 0, 1, 3, 2};
        assertEquals(7, t.trap(input));
    }
}