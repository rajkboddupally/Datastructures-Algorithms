package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCosttoHireKWorkersTest {

    TotalCosttoHireKWorkers totalCosttoHireKWorkers = new TotalCosttoHireKWorkers();

    @Test
    void totalCost() {
        int[] costs = new int[]{17,12,10,2,7,2,11,20,8};
        int k = 3, candidates = 4;
        assertEquals(11, totalCosttoHireKWorkers.totalCost(costs, k, candidates));
    }

    @Test
    void totalCost1() {
        int[] costs = new int[]{1,2,4,1};
        int k = 3, candidates = 3;
        assertEquals(4, totalCosttoHireKWorkers.totalCost(costs, k, candidates));
    }
}