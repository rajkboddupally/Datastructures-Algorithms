package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 8/6/2021 inside the package - arrays */

class BestTimetoBuyandSellStockIIITest {

    BestTimetoBuyandSellStockIII sellStockIII = new BestTimetoBuyandSellStockIII();

    @Test
    void maxProfit() {
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        Assertions.assertEquals(6, sellStockIII.maxProfit(prices));
    }

    @Test
    void maxProfit1() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Assertions.assertEquals(4, sellStockIII.maxProfit(prices));
    }

    @Test
    void maxProfit2() {
        int[] prices = new int[]{1};
        Assertions.assertEquals(0, sellStockIII.maxProfit(prices));
    }

    @Test
    void maxProfit3() {
        int[] prices = new int[]{7, 6, 4, 2, 1};
        Assertions.assertEquals(0, sellStockIII.maxProfit(prices));
    }

    @Test
    void maxProfit4() {
        int[] prices = new int[]{6, 1, 3, 2, 4, 7};
        Assertions.assertEquals(7, sellStockIII.maxProfit(prices));
    }

}
