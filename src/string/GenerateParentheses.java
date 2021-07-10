package string;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - string */

import java.util.ArrayList;
import java.util.List;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]

Constraints:
1 <= n <= 8
*/
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        helper(output, new StringBuilder(), 0, 0, n);
        return output;
    }

    private void helper(List<String> output, StringBuilder sb, int open, int close, int max) {

        if (open == max && close == max) {
            output.add(sb.toString());
            return;
        }

        if (open < max) {
            sb.append("(");
            helper(output, sb, open + 1, close, max);
            sb.setLength(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            helper(output, sb, open, close + 1, max);
            sb.setLength(sb.length() - 1);
        }
    }
}
