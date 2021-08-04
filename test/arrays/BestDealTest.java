package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestDealTest {
    BestDeal b = new BestDeal();

    @Test
    void bestDeal() {
        int[] prices = {1, 8, 6, 2, 5, 4, 88, 3, 7};
        int output = 87;
        Assertions.assertEquals(output, b.bestDeal(prices));
    }
}
