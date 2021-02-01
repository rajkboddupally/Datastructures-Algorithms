package string;

import java.util.HashMap;
import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Example 2:

Input: s = "IV"
Output: 4
Example 3:

Input: s = "IX"
Output: 9
Example 4:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInteger {
    public int romanToInt_V1(String s) {
        int intValue = 0;
        char[] charArr = s.toCharArray();

        for (int i = charArr.length - 1; i >= 0; i--) {
            if (i < charArr.length - 1) {
                if (charArr[i] == 'I' && (charArr[i + 1] == 'V' || charArr[i + 1] == 'X')) {
                    intValue -= 1;
                    continue;
                } else if (charArr[i] == 'X' && (charArr[i + 1] == 'L' || charArr[i + 1] == 'C')) {
                    intValue -= 10;
                    continue;
                } else if (charArr[i] == 'C' && (charArr[i + 1] == 'D' || charArr[i + 1] == 'M')) {
                    intValue -= 100;
                    continue;
                }
            }

            if (charArr[i] == 'I') {
                intValue += 1;
            } else if (charArr[i] == 'V') {
                intValue += 5;
            } else if (charArr[i] == 'X') {
                intValue += 10;
            } else if (charArr[i] == 'L') {
                intValue += 50;
            } else if (charArr[i] == 'C') {
                intValue += 100;
            } else if (charArr[i] == 'D') {
                intValue += 500;
            } else if (charArr[i] == 'M') {
                intValue += 1000;
            }
        }
        return intValue;
    }

    public int romanToInt(String s) {
        int roman = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int startIndex = 0;

        while (startIndex < s.length()) {

            if (startIndex < s.length() - 1) {
                String sub = s.substring(startIndex, startIndex + 2);
                if (map.get(sub) != null) {
                    roman += map.get(sub);
                    startIndex += 2;
                    continue;
                }
            }

            roman += map.get(s.substring(startIndex, startIndex + 1));
            startIndex++;

        }
        return roman;
    }
}
