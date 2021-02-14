package linkedlist;

public class SingleLinkedList {
    static Node head;
    static Node tail;

    public static void print() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.add("1");
        sl.add("2");
        sl.add("3");

        print();

    }

    public void add(String data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            // head.next = null;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    private static class Node<String> {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

}
