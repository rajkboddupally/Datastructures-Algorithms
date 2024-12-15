package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/*
https://leetcode.com/problems/maximum-average-pass-ratio/description/


There is a school that has classes of students and each class will be having a final exam. You are given a 2D integer array classes, where classes[i] = [passi, totali]. You know beforehand that in the ith class, there are totali total students, but only passi number of students will pass the exam.

You are also given an integer extraStudents. There are another extraStudents brilliant students that are guaranteed to pass the exam of any class they are assigned to. You want to assign each of the extraStudents students to a class in a way that maximizes the average pass ratio across all the classes.

The pass ratio of a class is equal to the number of students of the class that will pass the exam divided by the total number of students of the class. The average pass ratio is the sum of pass ratios of all the classes divided by the number of the classes.

Return the maximum possible average pass ratio after assigning the extraStudents students. Answers within 10-5 of the actual answer will be accepted.



Example 1:

Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
Output: 0.78333
Explanation: You can assign the two extra students to the first class. The average pass ratio will be equal to (3/4 + 3/5 + 2/2) / 3 = 0.78333.
Example 2:

Input: classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
Output: 0.53485


Constraints:

1 <= classes.length <= 105
classes[i].length == 2
1 <= passi <= totali <= 105
1 <= extraStudents <= 105

 */
public class MaximumAveragePassRatio {
    /*
    Approach:

1. Create a TreeMap : key as current ratio and value as Map of pass students and total students


2. Iterate through extra students and find the first element
	increase the pass students and total students
	update pass ration

3. Iterate through map and get the average of keys
     */

    public double maxAverageRatio_old(int[][] classes, int extraStudents) {
        Map<Double, Map<Double, Integer>> classMap = new TreeMap<>();

        for(int[] myclass: classes){
            double passStudents = myclass[0];
            int totalStudents = myclass[1];
            Map<Double, Integer> currentMap = new HashMap<>();
            currentMap.put(passStudents,totalStudents);
            classMap.put(passStudents/totalStudents, currentMap);
        }
        int counter = 0;
        while(counter < extraStudents){
            Map.Entry<Double, Map<Double, Integer>> lowestPassClass = classMap.entrySet().iterator().next();
            Map<Double, Integer> currentMap = lowestPassClass.getValue();

            double newPassStudents =currentMap.entrySet().iterator().next().getKey();
            newPassStudents++;
            int newTotalStudents =currentMap.entrySet().iterator().next().getValue();
            newTotalStudents++;

            Map<Double, Integer> updatedMap = new HashMap<>();
            updatedMap.put(newPassStudents,newTotalStudents);

            classMap.remove(lowestPassClass.getKey());

            classMap.put(newPassStudents/newTotalStudents, updatedMap);

            counter++;
        }
        double totalRatio = 0.0;
        for(Map.Entry<Double, Map<Double, Integer>> entry : classMap.entrySet()){
            totalRatio += entry.getKey();
        }

        return  totalRatio/classes.length;
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        /*
        Approach
        1. Create a heap which stores gain, pass and total students
        2. Iterate through extra Students
            2.1 Get heap element(max element) and increment all gain, pass and total students
        3. Iterate through heap and get pass/total students and add to total average
        4. return total average/total classes.

         */
        PriorityQueue<double[]> queue =  new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]));
        for(int[] myclass: classes){
            queue.add(new double[]{gain(myclass[0], myclass[1]), myclass[0], myclass[1]});
        }
        while(extraStudents-- >0){
            double[] top = queue.poll();
            int p = (int)top[1], t=(int)top[2];
            queue.add(new double[]{gain(p+1,t+1), p+1, t+1});
        }
        double totalAvg = 0.0;
        for(double[] c:queue){
            totalAvg += c[1] /c[2];
        }
        return totalAvg/classes.length;
    }

    private double gain(int pass, int total) {
        return ((double) (pass + 1) /(total+1) - (double) (pass) /(total));
    }
}
