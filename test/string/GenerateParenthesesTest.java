package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - string */

class GenerateParenthesesTest {
    GenerateParentheses gp = new GenerateParentheses();

    @Test
    void generateParenthesis() {
        int n = 3;
        String[] res = {"((()))", "(()())", "(())()", "()(())", "()()()"};
        Assertions.assertArrayEquals(res, gp.generateParenthesis(n).toArray());

    }

    @Test
    void generateParenthesis2() {
        int n = 2;
        String[] res = {"(())", "()()"};
        Assertions.assertArrayEquals(res, gp.generateParenthesis(n).toArray());

    }
}
