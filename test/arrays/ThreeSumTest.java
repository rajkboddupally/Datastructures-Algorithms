package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {
    ThreeSum t = new ThreeSum();

    @Test
    void threeSum() {
        int[] num = {-1, 0, 1, 2, -1, 2, -4, -2};
        List<List<Integer>> list = t.threeSumBinarySearch(num);
        for (List<Integer> mylist : list) {
            mylist.forEach(i -> System.out.print(i + " "));
            System.out.println();
        }

    }
}
