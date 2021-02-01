package arrays;

public class BestDeal {

    public int bestDeal(int[] prices) {
        int bestDeal = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                bestDeal = Math.max(bestDeal, prices[j] - prices[i]);
            }
        }
        return bestDeal;
    }
}
