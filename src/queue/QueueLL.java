package queue;

public class QueueLL {

    Node head;
    Node tail;
    private int size;

    public static void main(String[] args) throws Exception {
        QueueLL queue = new QueueLL();

        queue.enque("first");
        queue.enque("second");
        queue.enque("third");
        queue.enque("four");
        queue.enque("five");

        //queue.print();
        System.out.println("-----");
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println("-----");
        queue.enque("six");
        queue.enque("seven");

        //queue.print();
        System.out.println("-----");
        System.out.println(queue.deque());

    }

    public void enque(String item) {

        Node node = new Node(item);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

        size++;

    }

    public String deque() throws Exception {

        if (isEmpty())
            throw new Exception("Empty queue");

        String data = head.data;

        head = head.next;

        size--;

        return data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static class Node {

        public String data;
        public Node next;
        public Node previous;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;

        }
    }

}
