package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    ThreeSum t = new ThreeSum();

    @Test
    void threeSum() {
        int[] num = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = t.threeSum(num);
        for(List mylist : list){
            mylist.forEach(i -> System.out.print(i+" "));
            System.out.println();
        }

    }
}