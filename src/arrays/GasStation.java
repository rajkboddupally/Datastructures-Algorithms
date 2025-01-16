package arrays;

/*
https://leetcode.com/problems/gas-station/


Raj Kumar Boddupally created on 15/01/2025 inside the package - arrays

 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int baseStation = 0;

        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalCost > totalGas)
            return -1;

        while (baseStation < n) {
            if (gas[baseStation] != 0 && gas[baseStation] >= cost[baseStation]) {
                int gasRemainig = canCompleteCircuit(baseStation, gas, cost);
                if (gasRemainig >= 0)
                    return baseStation;
            }
            baseStation++;
        }
        return -1;
    }

    private int canCompleteCircuit(int baseStation, int[] gas, int[] cost) {
        int totalGas = 0;
        int n = gas.length;
        for (int j = baseStation, counter = 0; counter < gas.length; j++, counter++) {

            totalGas += gas[(j + n) % n] - cost[(j + n) % n];
            if (totalGas < 0)
                return -1;
        }
        return totalGas;
    }

}
