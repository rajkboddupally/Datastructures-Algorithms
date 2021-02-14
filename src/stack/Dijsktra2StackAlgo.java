package stack;

import java.util.Stack;

public class Dijsktra2StackAlgo {

    public static void main(String[] args) {
        String input = "(4+((2+6)*(8+4))+6)";

        Stack<Character> op = new Stack<>();
        Stack<Integer> val = new Stack<>();

        char[] charArray = input.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            if (charArray[i] == '(') {

            } else if (charArray[i] == '+' || charArray[i] == '*') {
                op.push(charArray[i]);
            } else if (charArray[i] == ')') {
                char operator = op.pop();
                if (operator == '*') {
                    val.push(val.pop() * val.pop());
                } else {
                    val.push(val.pop() + val.pop());
                }
            } else {
                val.push(charArray[i] - '0');
            }

        }
        System.out.println(val.pop());

    }

}
