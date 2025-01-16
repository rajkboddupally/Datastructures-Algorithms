package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    GasStation g = new GasStation();

    @Test
    void canCompleteCircuit() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        assertEquals(3, g.canCompleteCircuit(gas,cost));
    }

    @Test
    void canCompleteCircuit1() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

        assertEquals(-1, g.canCompleteCircuit(gas,cost));
    }
}