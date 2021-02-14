package queue;

import java.util.Stack;

public class Queue2StacksOptimised {
    private final Stack<String> stack1 = new Stack<>();
    private final Stack<String> stack2 = new Stack<>();
    private boolean indicator;

    public static void main(String[] args) throws Exception {
        Queue2StacksOptimised sq = new Queue2StacksOptimised();

        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0)
                System.out.println(sq.deque());
            else

                sq.enque("" + i);
        }
    }

    public void enque(String data) {
        stack1.push(data);
    }

    public String deque() throws Exception {

        if (stack1.isEmpty() && stack2.isEmpty())
            throw new Exception("no data ");
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            stack1.clear();
        }

        return stack2.pop();
    }

}
