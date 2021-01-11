package string;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = lengthOfLongestSubstring(str);
        System.out.println("max length "+length);

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        List<String> subStringList = new ArrayList<>();
        String temp = "";
        int index = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length;i++) {
            if(temp.indexOf(arr[i]) > -1){
                index = temp.indexOf(arr[i]);
                temp = temp.substring(index+1) + arr[i];
            }
            else{
                temp = temp.concat(String.valueOf(arr[i]));
            }
            maxLength=  Math.max(maxLength, temp.length());
        }
       return maxLength;
    }
}
