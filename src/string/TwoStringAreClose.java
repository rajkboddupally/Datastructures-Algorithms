package string;

/*
Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.



Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
Example 2:

Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
Example 3:

Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"
Example 4:

Input: word1 = "cabbba", word2 = "aabbss"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any amount of operations.


Constraints:

1 <= word1.length, word2.length <= 105
word1 and word2 contain only lowercase English letters.
 */

import java.util.*;

public class TwoStringAreClose {

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())
            return false;

        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();

        Set<Character> word1DistinctChars = new HashSet<>();
        Set<Character> word2DistinctChars = new HashSet<>();

        for (int i = 0; i < word1CharArray.length; i++) {
            word1DistinctChars.add(word1CharArray[i]);
            word2DistinctChars.add(word2CharArray[i]);
        }


        if (!word1DistinctChars.containsAll(word2DistinctChars) || !word2DistinctChars.containsAll(word1DistinctChars))
            return false;

        int[] word1Arr = new int[26];
        int[] word2Arr = new int[26];

        for (int i = 0; i < word1CharArray.length; i++) {
            word1Arr[word1CharArray[i] - 'a']++;
            word2Arr[word2CharArray[i] - 'a']++;
        }

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        if (!Arrays.equals(word1Arr, word2Arr))
            return false;

        return true;
    }
}
