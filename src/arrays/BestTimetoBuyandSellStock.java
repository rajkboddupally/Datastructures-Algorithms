package arrays;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */
public class BestTimetoBuyandSellStock {

    public int bestDeal(int[] prices) {
        int bestDeal = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                bestDeal = Math.max(bestDeal, prices[j] - prices[i]);
            }
        }
        return bestDeal;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock bestdeal = new BestTimetoBuyandSellStock();
        int[] arr = {4, 2, 1, 0};
        System.out.println(bestdeal.bestDeal_Optimized(arr));
    }

    public int bestDeal_Optimized(int[] prices) {
        int bestDeal = Integer.MIN_VALUE;
        int minBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            bestDeal = Math.max(bestDeal, prices[i] - minBuy);
        }
        return bestDeal;
    }
}
