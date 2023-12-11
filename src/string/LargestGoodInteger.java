package string;

/*
You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.


Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.


Constraints:

3 <= num.length <= 1000
num only consists of digits.
 */
public class LargestGoodInteger {

    public static String largestGoodInteger(String num) {
        int largestGoodInteger = -1;
        StringBuilder goodInteger = new StringBuilder(3);
        char lastAdded = 'x';
        int counter = 0;
        for (char c : num.toCharArray()) {
            if (c != lastAdded) {
                goodInteger = new StringBuilder(3);
                counter = 0;
                lastAdded = c;
            } else {
                counter++;
            }
            goodInteger.append(c);
            if (counter == 2) {
                largestGoodInteger = Math.max(largestGoodInteger, Integer.parseInt(goodInteger.toString()));
                goodInteger = new StringBuilder(3);
                counter = 0;
            }
        }
        if(largestGoodInteger ==0)
            return "000";
        return largestGoodInteger != -1 ? String.valueOf(largestGoodInteger) : "";
    }

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));
    }
}
