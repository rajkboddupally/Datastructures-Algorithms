package arrays;

/*
https://leetcode.com/problems/total-cost-to-hire-k-workers/

Raj Kumar Boddupally created on 03/01/2025 inside the package - arrays

 */
public class TotalCosttoHireKWorkers {

  // This solution does not work for larger inputs. Time limit exceeds. Use PriorityQueue to store next cheap labor

    /* Approach
    1. Iterate k to 0
    2. Find the min value from 0 to candidates.
    3. Find the min value from length-candidates to length
    4. Get min of 2 & 3 and.  Add to totalCost.  Replace min value with 0;


[17,12,10,2,7,2,11,20,8], k = 3, candidates = 4



    public long totalCost(int[] costs, int k, int candidates) {

        long totalCost = 0;
        while (k-- > 0) {
            int[] leftMin = findMin(costs, 0, candidates);
            int rightStart = costs.length > candidates ? costs.length - candidates : 0;
            int[] rightMin = findMin(costs, rightStart, costs.length);
            if (leftMin[0] <= rightMin[0]) {
                totalCost += leftMin[0];
                costs = reshuffle(costs, leftMin[1]);
            } else {
                totalCost += rightMin[0];
                costs = reshuffle(costs, rightMin[1]);
            }
        }

        return totalCost;
    }

    private int[] reshuffle(int[] costs, int startIndex) {
        int[] newArr = new int[costs.length - 1];
        for (int i = 0; i < startIndex; i++) {
            newArr[i] = costs[i];
        }
        for (int j = startIndex; j < newArr.length; j++) {
            newArr[j] = costs[j + 1];
        }
        return newArr;
    }

    private int[] findMin(int[] costs, int left, int right) {
        int minCost = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = left; i < right; i++) {
            if (i < costs.length && costs[i] < minCost) {
                minCost = costs[i];
                minIndex = i;
            }
        }
        return new int[]{minCost, minIndex};
    }

    */

    //Efficient approach: Use PriorityQueue
    /*
     Initiate 2 PQs, int totalCost, i->0 and j-> length-1
            1. Iterate k to 0
            2. in a loop, check size of pq1 && i<=j.  if it is < candidates, then add costs[i++].
            3. in a loop, check size of pq2 && i<=j.  if it is < candidates, then add costs[j--].
            4. Compare pq1 peek vs pq2 peek.  Add the lowest to totalCost.
     */
    public long totalCost(int[] costs, int k, int candidates) {


        return 0;
    }
}
