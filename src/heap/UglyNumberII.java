package heap;

import java.util.HashSet;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/ugly-number-ii/description/?envType=daily-question&envId=2025-01-04

Raj Kumar Boddupally created on 04/01/2025 inside the package - heaps

 */
public class UglyNumberII {

    public int nthUglyNumber(int n) {

        PriorityQueue<Long> uglyHeap = new PriorityQueue<>();
        HashSet<Long> uglySet = new HashSet<>();
        int[] primes = new int[]{2, 3, 5};

        uglyHeap.add(1L);
        uglySet.add(1L);

        Long currUgly = 1L;

        for (int i = 0; i < n; i++) {
            currUgly = uglyHeap.poll();

            for (int prime : primes) {
                Long nextUgly = currUgly * prime;
                if (!uglySet.contains(nextUgly)) {
                    uglySet.add(nextUgly);
                    uglyHeap.add(nextUgly);
                }
            }

        }
        return Math.toIntExact(currUgly);
    }

}
