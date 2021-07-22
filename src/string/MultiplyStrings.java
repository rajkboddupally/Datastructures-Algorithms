package string;

/* Raj Kumar Boddupally created on 7/21/2021 inside the package - string */
/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"


Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        MultiplyStrings m = new MultiplyStrings();
        //System.out.println(m.multiply("5", "6"));
        System.out.println(m.multiply("123456789", "987654321"));
        System.out.println(m.multiply("498828660196", "840477629533"));

    }

    public String multiply(String num1, String num2) {
        String sum = "0";
        int iFactor = 1;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int jFactor = 1;
            for (int j = num2.length() - 1; j >= 0; j--) {
                sum = String.valueOf((Long.parseLong(sum) + (long) (num2.charAt(j) - '0') * (num1.charAt(i) - '0') * jFactor * iFactor));
                jFactor *= 10;
            }
            iFactor *= 10;
        }
        return sum;
    }
}
