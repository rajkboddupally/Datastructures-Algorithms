package stack;

public class StackLL {

    private int size;
    private Node first;
    private Node max;

    public static void main(String[] args) throws Exception {

        StackLL sl = new StackLL();

        sl.push(87);
        for (int i = 10; i > 0; i--) {
            sl.push(i);
        }

        System.out.println(sl.max());

    }

    public void push(int data) {

        Node oldFirst = first;
        first = new Node();
        first.data = data;
        first.next = oldFirst;
        size++;

    }

    public int pop() throws Exception {
        if (size == 0)
            throw new Exception("No elements in the stack");
        int data = first.data;
        first = first.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int max() {
        Node temp = first;
        int max = temp.data;
        while (temp != null) {
            if (max < temp.data)
                max = temp.data;
            temp = temp.next;
        }

        return max;
    }

    private static class Node {
        private int data;
        private Node next;
    }

}
