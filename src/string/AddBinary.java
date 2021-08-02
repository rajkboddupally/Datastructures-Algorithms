package string;

/* Raj Kumar Boddupally created on 8/1/2021 inside the package - string */
/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary("11", "1"));
        System.out.println(ab.addBinary("1010", "1011"));
        System.out.println(ab.addBinary("0", "0"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry % 2);
        }

        return sb.reverse().toString();
    }

    public String addBinaryV1(String a, String b) {
        return convertToBinaryString(convertToInt(a), convertToInt(b));
    }

    private String convertToBinaryString(Integer a1, Integer b1) {
        String result = "";
        int sum = a1 + b1;
        while (sum > 0) {
            result = String.valueOf(sum % 2).concat(result);
            sum /= 2;
        }
        return result.equals("") ? "0" : result;
    }

    private Integer convertToInt(String a) {
        int sum = 0;
        int factor = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            sum += Math.pow(2, factor) * Character.getNumericValue(a.charAt(i));
            factor++;
        }
        return sum;
    }
}

