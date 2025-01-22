package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {
JumpGameII j = new JumpGameII();
    @Test
    void jump() {
        int[] arr = new int[]{1,2,1,1,1};
        assertEquals(3, j.jump(arr));
    }
}