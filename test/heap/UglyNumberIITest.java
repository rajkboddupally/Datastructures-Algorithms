package heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberIITest {
    UglyNumberII u = new UglyNumberII();
    @Test
    void nthUglyNumber() {
        assertEquals(12, u.nthUglyNumber(10));
    }

    @Test
    void nthUglyNumber1() {
        assertEquals(1, u.nthUglyNumber(1));
    }
}