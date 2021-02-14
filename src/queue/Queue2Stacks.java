package queue;

import java.util.Stack;

public class Queue2Stacks {
	Stack<String> stack1 = new Stack<>();
	Stack<String> stack2 = new Stack<>();

	public static void main(String[] args) {
		Queue2Stacks sq = new Queue2Stacks();
		sq.enque("first");
		sq.enque("second");
		sq.enque("third");
		System.out.println(sq.deque());
		sq.enque("four");
		System.out.println(sq.deque());
	}

	public void enque(String data) {
		while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}

		stack1.push(data);

		while (!stack2.empty())
			stack1.push(stack2.pop());
	}

	public String deque() {
		return stack1.pop();
	}

}
