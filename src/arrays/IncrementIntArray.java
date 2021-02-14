package arrays;

import java.util.Arrays;

/**
 * [1,2,4]. ->. [1,2,5] [1,2,9]. ->. [1,3,0] [9,9,9] -> [1,0,0,0]
 * <p>
 * <p>
 * 4*1+2*10*1*100 = 124
 * <p>
 * <p>
 * 1. Convert to int and increment 2. Convert to array
 *
 * @author rajkumarboddupally
 */
public class IncrementIntArray {

    public static void main(String[] args) {
        int[] input = {9, 9, 9, 7, 9};
        int length = input.length;
        int[] output = new int[input.length];
        int total = 0;

        int carryOn = 1;

        for (int i = length - 1; i >= 0; i--) {
            total = carryOn + input[i];
            if (total == 10)
                carryOn = 1;
            else
                carryOn = 0;

            output[i] = total % 10;
        }

        if (carryOn == 1) {
            output = new int[input.length + 1];
            output[0] = 1;
        }

        System.out.println(Arrays.toString(output));

    }

    /**
     * public static void main(String[] args) { int[] input = { 9, 9, 9 }; // int[]
     * output; ArrayList<Integer> list = new ArrayList<>(); int length =
     * input.length; int number = 0;
     *
     * for (int i = 0; i < length; i++) { number = number * 10 + input[i]; //
     * System.out.println(number); } System.out.println(number); number++; ///
     * System.out.println(Arrays.);
     *
     * String str = String.valueOf(number); int strLength = str.length();
     *
     * int[] output = new int[strLength];
     *
     * for (int j = 0; j < str.length(); j++) {
     *
     * System.out.println(str.charAt(j)); // strLength--; output[j] = str.charAt(j)
     * - '0';
     *
     * // System.out.println(output[j]);
     *
     * }
     *
     * System.out.println(Arrays.toString(output)); }
     **/

}
