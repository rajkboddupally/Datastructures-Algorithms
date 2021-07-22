package string;
/* Raj Kumar Boddupally created on 7/22/2021 inside the package - string */

/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        LengthofLastWord l = new LengthofLastWord();
        System.out.println(l.lengthOfLastWord("Hello World"));
        System.out.println(l.lengthOfLastWord(" "));
        System.out.println(l.lengthOfLastWord(""));
    }

    public int lengthOfLastWord(String s) {
        if (s.isBlank()) return 0;
        String[] strArr = s.split(" ");
        return strArr[strArr.length - 1].length();
    }
}
