package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation e = new EvaluateReversePolishNotation();

    @Test
    void evalRPN() {
        String[] i = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, e.evalRPN(i));
    }
}