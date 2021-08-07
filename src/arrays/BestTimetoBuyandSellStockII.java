package arrays;

/*
Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


Constraints:

1 <= prices.length <= 3 * 10 ^ 4
0 <= prices[i] <= 10 ^ 4
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit_V0(int[] prices) {
        int maxProfit = 0;
        int tempProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int current = prices[i];
            int nextMax = prices[i + 1];
            int counter = i;

            for (int j = i + 2; j < prices.length; j++) {
                if (current < nextMax) {
                    if (prices[j] > nextMax) {
                        counter = j;
                        nextMax = prices[j];
                    } else {
                        break;
                    }
                }
            }
            if (nextMax > current) {
                tempProfit += nextMax - current;
                i = counter;
            }
            //maxProfit = Math.max(maxProfit, tempProfit);
        }
        return tempProfit;
    }

    public int maxProfit_V10(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 0;
        int i = 0;

        while (i < prices.length - 1) {

            while (i < prices.length - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            buy = prices[i];

            while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            sell = prices[i];
            maxProfit += sell - buy;
        }
        return maxProfit;
    }

    //{7, 1, 5, 3, 6, 4};
    public int maxProfit_v2(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }


    public int maxProfit(int[] prices) {
        int maxProfitTotal = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                minPrice = prices[i];
            } else {
                maxProfitTotal += prices[i] - minPrice;
                minPrice = prices[i];
            }
        }
        return maxProfitTotal;
    }


}
