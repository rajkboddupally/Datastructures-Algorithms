package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackBracketValid {

    public static void main(String[] args) {
        String input = "{{()}}(){{{}}}";
        boolean isValid = isValid(input);
        System.out.println("isValid Expression - " + isValid);

    }

    private static boolean isValid(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> myStack = new Stack<>();
        Map<Character, Character> expressionMapping = new HashMap<>();

        expressionMapping.put('{', '}');
        expressionMapping.put('(', ')');

        for (char i : arr) {
            if (isLeftBracket(i)) {
                myStack.push(i);
            } else if (myStack.isEmpty() || expressionMapping.get(myStack.pop()) != i) {
                return false;
            }
        }

        return myStack.isEmpty();
    }

    private static boolean isLeftBracket(char c) {
        return c == '{' || c == '(';
    }

}
