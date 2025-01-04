package string;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/unique-length-3-palindromic-subsequences/?envType=daily-question&envId=2025-01-04
Raj Kumar Boddupally created on 04/01/2025 inside the package - strings
 */
public class UniqueLength3PalindromicSubsequences {

    /*
    Approach
    1. interate through chars in 3 loops,
    2. pick each 3 chars and check if it is a palindrome
     */
    public int countPalindromicSubsequence_v0(String s) {
        char[] chars = s.toCharArray();
        Set<String> palindromes = new HashSet<>();

        for (int i = 0; i < chars.length - 2; i++) {
            for (int j = i + 1; j < chars.length - 1; j++) {
                for (int k = j + 1; k < chars.length; k++) {
                    StringBuilder sb = new StringBuilder().append(chars[i]).append(chars[j]).append(chars[k]);
                    if (chars[i] == chars[k]) {
                        palindromes.add(sb.toString());
                    }
                }
            }
        }
        return palindromes.size();
    }

    /*
     efficient approach:
     1. Find first and 2nd occurance of each character and save in array.
     2. Iterate through array and check if first and 2nd occurance is not -1,
     3. then Iterate from first to 2nd occurance and add chars to hashset.
     4. Add hashset count to finalCount.
     */
    public int countPalindromicSubsequence(String s) {
        int total = 0;

        Pair[] arr = new Pair[26];

        //initialization with -1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(-1, -1);
        }

        //set index for first and second occurance

        for (int i = 0; i < s.length(); i++) {
            Pair pair = arr[s.charAt(i) - 'a'];
            if (pair.firstOccurance == -1)
                pair.firstOccurance = i;
            else
                pair.secondOccurance = i;
        }

        //Iterate arr for non -1s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].firstOccurance != -1 && arr[i].secondOccurance != -1) {
                Set<Character> elements = new HashSet<>();
                //iterate from first to second occurance
                for (int j = arr[i].firstOccurance + 1; j < arr[i].secondOccurance; j++) {
                    elements.add(s.charAt(j));
                }
                total += elements.size();
            }
        }
        return total;
    }


}

class Pair {
    int firstOccurance;
    int secondOccurance;

    public Pair(int firstOccurance, int secondOccurance) {
        this.firstOccurance = firstOccurance;
        this.secondOccurance = secondOccurance;
    }
}
