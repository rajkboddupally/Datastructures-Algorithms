package string;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        char[] charArr = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while (i < charArr.length) {

            for (int index = 0; index < numRows && i < charArr.length; index++) {
                sb[index].append(charArr[i++]);
            }

            for (int index = numRows - 2; index > 0 && i < charArr.length; index--) {
                sb[index].append(charArr[i++]);
            }

        }

        for (int k = 1; k < sb.length; k++) {
            sb[0].append(sb[k]);
        }
        return sb[0].toString();
    }

}
