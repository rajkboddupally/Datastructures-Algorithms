package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        twoSumSorted(nums,target);
    }
    public static int[] twoSum(int[] nums, int target) {

        //Arrays.sort(nums);
        int[] output = new int[2];
        outerloop:
        for(int i=0;i< nums.length-1;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    output[0] = i; output[1] = j;
                    break outerloop;
                }
            }
        }

        for(int k=0;k< output.length;k++){
            System.out.print(" "+output[k]);
        }
        return output;
    }
/*
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

 */
    public static int[] twoSumSorted(int[] numbers, int target) {

       // Arrays.sort(nums);
        int[] output = new int[2];
        outerloop:
        for(int i=0;i< numbers.length-1;i++){

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    output[0] = i+1; output[1] = j+1;
                    break outerloop;
                }
                else if(numbers[i] + numbers[j] > target){
                    break;
                }
            }
        }

        for(int k=0;k< output.length;k++){
            System.out.print(" "+output[k]);
        }
        return output;
    }

    /*
            int[] nums = {6,4,8,3,2};
        int target = 8;
        2 0
        4 1
        5 2
        6 3


     */
    public static int[] twoSumImproved(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(nums[i])){
                output[0] = map.get(nums[i]);
                output[1] = i;
                System.out.println("Combination "+  output[0] + " "+output[1]);
                break;
            }
            map.put(diff,i);
        }



        return output;
    }


}
