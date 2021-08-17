package arrays;

/* Raj Kumar Boddupally created on 8/17/2021 inside the package - arrays */

/*
    Write a program a3+b3=c3+d3 where a=b=c=d < 100
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoCubes {
    public static void main(String[] args) {

        bluntSolution();
        // optimizedSolution();

    }

    private static void optimizedSolution() {
        Map<Long, List<List<Integer>>> pairsMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j != i && j < 100; j++) {
                long sum = (long) (Math.pow(i, 3) + Math.pow(j, 3));
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                if (pairsMap.get(sum) != null) {
                    List<List<Integer>> mainList = pairsMap.get(sum);
                    mainList.add(list);
                } else {
                    List<List<Integer>> mainList = new ArrayList<>();
                    mainList.add(list);
                    pairsMap.put(sum, mainList);
                }
            }
        }

        for (Map.Entry<Long, List<List<Integer>>> entry : pairsMap.entrySet()) {
            if (pairsMap.values().size() > 1) {
                System.out.print(" SUM " + entry.getKey() + "  ");
                List<List<Integer>> mainList = entry.getValue();
                for (List<Integer> list : mainList) {
                    System.out.print(list.get(0) + "," + list.get(1) + "  ");
                }
                System.out.println();
            }
        }
    }

    private static void bluntSolution() {
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j != i && j < 200; j++) {
                for (int k = 0; k != j && k != i && k < 200; k++) {
                    for (int l = 0; l != k && l != j && l != i && l < 200; l++) {
                        if ((long) (Math.pow(i, 3) + Math.pow(j, 3)) == (long) (Math.pow(k, 3) + Math.pow(l, 3)))
                            System.out.println(i + " " + j + " " + k + " " + l);
                    }
                }
            }
        }
    }
}
