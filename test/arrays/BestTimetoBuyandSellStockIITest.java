package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimetoBuyandSellStockIITest {
    BestTimetoBuyandSellStockII b = new BestTimetoBuyandSellStockII();

    @Test
    void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = 7;
        Assertions.assertEquals(maxProfit, b.maxProfit(prices));
    }


    @Test
    void maxProfit1() {
        int[] prices = {1, 2, 3, 4, 5};
        int maxProfit = 4;
        Assertions.assertEquals(maxProfit, b.maxProfit(prices));
    }


    @Test
    void maxProfit2() {
        int[] prices = {8, 2, 5, 6, 3, 7, 20, 1, 3};
        int maxProfit = 23;
        Assertions.assertEquals(maxProfit, b.maxProfit(prices));
    }

    @Test
    void maxProfit3() {
        int[] prices = {8, 2};
        int maxProfit = 0;
        Assertions.assertEquals(maxProfit, b.maxProfit(prices));
    }
}
