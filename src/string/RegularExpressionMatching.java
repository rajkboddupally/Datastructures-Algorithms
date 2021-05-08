package string;

/*
Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).



Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
Example 4:

Input: s = "aab", p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
Example 5:

Input: s = "mississippi", p = "mis*is*p*."
Output: false


Constraints:

0 <= s.length <= 20
0 <= p.length <= 30
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */

/*Cases

Take each character from s.
1.  If it is a match with p... increment both p and s
2.  If it a ...   increment both p and s
3.  If it is character not matching.. then check next p. if it is *.. proceed
4.  If it is character not matching... next is not *...  return false.

 */

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {

        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int sIndex = 0, pIndex = 0;

        while (sIndex < sArr.length && pIndex < pArr.length) {
            if (sArr[sIndex] == pArr[pIndex] || pArr[pIndex] == '.') {
                sIndex++;
                pIndex++;
            } else if (pArr[pIndex] == '*') {
                char pChar = pArr[pIndex - 1];
                while (sIndex < sArr.length && (sArr[sIndex] == pChar || pChar == '.')) {
                    sIndex++;
                }
                pIndex++;
                if (pIndex < pArr.length && pArr[pIndex] == pChar) {
                    pIndex++;
                }
            } else if (sArr[sIndex] != pArr[pIndex] && (pIndex < pArr.length - 1) && pArr[pIndex + 1] == '*') {
                pIndex = pIndex + 2;
            } else {
                return false;
            }
        }
        return sIndex == sArr.length && pIndex == pArr.length;
    }

}
