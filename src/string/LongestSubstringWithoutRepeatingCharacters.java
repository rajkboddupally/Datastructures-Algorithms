package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring1(String s) {
        char[] arr = s.toCharArray();
        int maxLength = 0;
        String temp = new String();

        for (int i = 0; i < arr.length; i++) {
            if (temp.indexOf(arr[i]) == -1) {
                temp = temp.concat(String.valueOf(arr[i]));
            } else {
                maxLength = Math.max(maxLength, temp.length());
                temp = temp.substring(temp.indexOf(arr[i]) + 1) + String.valueOf(arr[i]);
            }
        }
        return Math.max(maxLength, temp.length());
    }

    //abba
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int begin = 0, end = 0; end < s.length(); ++end) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                begin = Math.max(begin,map.get(c) + 1);
            }
            map.put(c, end);
            maxCount = Math.max(maxCount, end - begin + 1);
        }
        return maxCount;
    }
}
