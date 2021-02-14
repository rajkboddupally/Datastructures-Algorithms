package stack;

import java.util.LinkedList;

public class StackFromLL {
    int size;
    LinkedList<String> queue;

    public StackFromLL() {
        this.queue = new LinkedList<>();
        this.size = 0;
    }

    public static void main(String[] args) {
        StackFromLL q = new StackFromLL();

        q.enque("first");
        q.enque("two");
        q.enque("third");
        q.enque("four");

        q.deque();
        q.deque();

        q.size();

        q.peek();

        q.peek();

        q.size();

    }

    public void enque(String element) {
        System.out.println("adding " + element);
        queue.add(element);
        size++;
    }

    public String deque() {
        String element = queue.removeLast();
        size--;
        System.out.println("removing " + element);
        return element;
    }

    public int size() {
        System.out.println("queue size " + size);
        return size;
    }

    public String peek() {
        String element = queue.getLast();
        System.out.println("peeking " + element);
        return element;
    }

}
