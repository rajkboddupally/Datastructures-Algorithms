package queue;

import java.util.LinkedList;

public class QueueFromLL {
    int size;
    LinkedList<String> queue;

    public QueueFromLL() {
        this.queue = new LinkedList<>();
        this.size = 0;
    }

    public static void main(String[] args) {
        QueueFromLL q = new QueueFromLL();

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
        String element = queue.removeFirst();
        size--;
        System.out.println("removing " + element);
        return element;
    }

    public int size() {
        System.out.println("queue size " + size);
        return size;
    }

    public String peek() {
        String element = queue.getFirst();
        System.out.println("peeking " + element);
        return element;
    }

}
