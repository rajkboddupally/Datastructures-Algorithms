package arrays;/* Raj Kumar Boddupally created on 6/7/2021 inside the package - arrays */

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].


Constraints:

2 <= cost.length <= 1000
0 <= cost[i] <= 999
   Hide Hint #1
Say f[i] is the final cost to climb to the top from step i. Then f[i] = cost[i] + min(f[i+1], f[i+2]).
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length < 2)
            return 0;
        int minSteps = 0;
        int i = cost.length;
        while (i > 1) {
            minSteps += Math.min(cost[i - 1], cost[i - 2]);
            if (cost[i - 1] < cost[i - 2])
                i = i - 1;
            else
                i = i - 2;
        }
        return minSteps;
    }
}
