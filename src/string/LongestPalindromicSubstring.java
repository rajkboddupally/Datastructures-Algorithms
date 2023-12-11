package string;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class LongestPalindromicSubstring {
    /*
    public String longestPalindrome_V0(String s) {

        String sub = "";
        String longestPalindrome = "";
        int stringStartIndex = 0;
        int stringEndIndex = s.length() - 1;


        while (stringStartIndex < stringEndIndex) {
            boolean isPalindrome = true;
            char charAtIndex = s.charAt(stringStartIndex);
            int index = s.lastIndexOf(charAtIndex);
            if (i == index) {
                sub = s.substring(i, index + 1);
            } else {
                sub = s.substring(i, index + 1);
                int startIndex = 0;
                int endIndex = sub.length() - 1;
                while (startIndex < endIndex) {
                    if (sub.charAt(startIndex) != sub.charAt(endIndex)) {
                        isPalindrome = false;
                        break;
                    }
                    startIndex++;
                    endIndex--;
                }
            }
            if (isPalindrome) {
                stringStartIndex++;
                if (sub.length() > longestPalindrome.length()) {
                    longestPalindrome = sub;
                }
            }
        }

        return longestPalindrome;
    }
    */


    public String longestPalindrome_v2(String s) {

        String sub = "";
        String longestPalindrome = "";
        //outerloop:
        for (int i = 0; i < s.length(); i++) {
            int stringStartIndex = i;
            int stringEndIndex = s.length() - 1;
            if (longestPalindrome.length() > stringEndIndex - stringStartIndex)
                break;
            while (stringStartIndex <= stringEndIndex) {
                boolean isPalindrome = false;
                sub = s.substring(stringStartIndex, stringEndIndex + 1);
                if (s.charAt(stringStartIndex) == s.charAt(stringEndIndex)) {
                    isPalindrome = true;
                    int startIndex = 0;
                    int endIndex = sub.length() - 1;
                    while (startIndex < endIndex) {
                        if (sub.charAt(startIndex) != sub.charAt(endIndex)) {
                            isPalindrome = false;
                            break;
                        }
                        startIndex++;
                        endIndex--;
                    }
                }
                if (isPalindrome && sub.length() > longestPalindrome.length()) {
                    longestPalindrome = sub;
                    break;
                }
                stringEndIndex--;
            }
        }
        return longestPalindrome;
    }

    public static int longestPalindrome_v3(String s) {
        Set<Character> charSet = new HashSet<>();
        int counter = 0;

        for (char c : s.toCharArray()) {
            if (!charSet.add(c)) {
                charSet.remove(c);
                counter += 2;
            }
        }

        if (!charSet.isEmpty())
            counter++;

        return counter;
    }

    public static int longestPalindrome(String s) {
        int[] charArray = new int[256];
        int counter = 0;

        for (char c : s.toCharArray()) {
            if (charArray[c] == 1) {
                charArray[c] = 0;
                counter += 2;
            } else {
                charArray[c] = 1;
            }
        }

        for (char c : s.toCharArray()) {
            if (charArray[c] == 1) {
                counter++;
                break;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ccc"));
    }

}
