package arrays;

/* Raj Kumar Boddupally created on 8/6/2021 inside the package - arrays */

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).



Example 1:

Input: prices = [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
Example 4:

Input: prices = [1]
Output: 0


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 105
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {

        int buyOne = Integer.MAX_VALUE, buyTwo = Integer.MAX_VALUE, buySellOne = 0, buySellTwo = 0;
        for (int i = 0; i < prices.length; i++) {
            buyOne = Math.min(buyOne, prices[i]);
            buySellOne = Math.max(buySellOne, prices[i] - buyOne);
            buyTwo = Math.min(buyTwo, prices[i] - buySellOne);
            buySellTwo = Math.max(buySellTwo, prices[i] - buyTwo);
        }

        return buySellTwo;
    }


    private int maxProfitOneTransaction(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

}
