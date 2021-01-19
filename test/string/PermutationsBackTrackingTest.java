package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermutationsBackTrackingTest {
    PermutationsBackTracking p;
    @BeforeEach
    void setUp() {
        p=new PermutationsBackTracking();
    }

    @Test
    void permute() {
        p.permute("abcd", 0, 2);
    }
}