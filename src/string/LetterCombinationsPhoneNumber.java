package string;

/* Raj Kumar Boddupally created on 7/9/2021 inside the package - string */

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsPhoneNumber lcp = new LetterCombinationsPhoneNumber();

        List<String> list = lcp.letterCombinations("3485769");
        /*
        for (String str : list) {
            System.out.println(str);
        }
        */
        System.out.println("Size " + list.size());

    }

    public List<String> letterCombinations(String digits) {

        LinkedList<String> ans = new LinkedList<String>();

        if (digits.isEmpty())
            return ans;

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        ans.add("");

        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String s = ans.remove();

                for (char c : mapping[digit].toCharArray()) {
                    ans.add(s + c);
                }
            }
        }
        return ans;
    }
}
