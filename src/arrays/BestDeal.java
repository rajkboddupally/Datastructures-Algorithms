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

    public static void main(String[] args) {
        BestDeal bestdeal = new BestDeal();
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
