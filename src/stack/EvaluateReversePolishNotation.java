package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();


        for (String token : tokens) {
            int first, second;
            switch (token) {
                case "+":
                    second = s.pop();
                    first = s.pop();
                    s.push(second + first);
                    break;
                case "-":
                    second = s.pop();
                    first = s.pop();
                    s.push(first - second);
                    break;
                case "*":
                    second = s.pop();
                    first = s.pop();
                    s.push(first * second);
                    break;
                case "/":
                    second = s.pop();
                    first = s.pop();
                    s.push(first / second);
                    break;
                default:
                    s.push(Integer.valueOf(token));
            }
        }
        return s.pop();
    }
}
