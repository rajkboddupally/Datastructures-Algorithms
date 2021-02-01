package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    ContainerWithMostWater c = new ContainerWithMostWater();

    @BeforeEach
    void setUp() {

    }

    @Test
    void maxArea() {

        int[] height = {1,8,6,2,5,4,8,3,7};
        int output = 49;
        Assertions.assertEquals(output, c.maxArea(height));
    }
}