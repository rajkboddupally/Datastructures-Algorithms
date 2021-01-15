package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMaximumGeneratedArrayTest {
    GetMaximumGeneratedArray g;

    @BeforeEach
    void setUp() {
        g = new GetMaximumGeneratedArray();
    }

    @Test
    void getMaximumGenerated() {
        Assertions.assertEquals(3, g.getMaximumGenerated(7));
    }

    @Test
    void getMaximumGenerated1() {
        Assertions.assertEquals(1, g.getMaximumGenerated(2));
    }

    @Test
    void getMaximumGenerated2() {
        Assertions.assertEquals(0, g.getMaximumGenerated(0));
    }
}