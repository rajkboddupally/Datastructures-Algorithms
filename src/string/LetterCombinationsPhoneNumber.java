package string;

/* Raj Kumar Boddupally created on 7/9/2021 inside the package - string */

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsPhoneNumber lcp = new LetterCombinationsPhoneNumber();

        List<String> list = lcp.letterCombinations("23");
        for (String str : list) {
            System.out.println(str);
        }

    }

    public List<String> letterCombinations(String digits) {

        LinkedList<String> ans = new LinkedList<>();
        ans.add("");
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        while (ans.peek().length() != digits.length()) {
            String remove = ans.remove();
            System.out.println("remove len " + remove.length());
            String myMap = map[digits.charAt(remove.length()) - '0'];
            System.out.println("myMap " + myMap);
            for (char c : myMap.toCharArray()) {
                ans.addLast(remove + c);
            }
        }
        return ans;
    }
}
