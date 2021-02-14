package linkedlist;

import java.util.Iterator;

public class DoublyLinkedList implements Iterable {

    private int size = 0;
    private Node head, tail = null;

    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();
        for (int i = 0; i < 5; i++)
            dl.add(new Node("" + i));

        dl.print();

        // dl.remove("four");

        System.out.println("#############");

        /// dl.print();

        //dl.reverse();

        dl.reverseRecurssion(dl.getHead(), null);

        dl.print();

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node getHead() {
        return head;
    }

    public void addFirst(Node node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(Node node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node.previous;
            tail = node;
        }
        size++;
    }

    public void add(Node node) {
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

    public String remove(String data) {
        Node tmp = head;
        String nodeData = "";
        while (tmp != null && !tmp.data.equalsIgnoreCase(data)) {
            tmp = tmp.next;
        }
        nodeData = tmp.data;

        if (tmp == head)
            head = tmp.next;
        else
            tmp.previous.next = tmp.next;

        tmp.data = null;
        tmp.next = null;
        tmp.previous = null;

        return nodeData;
    }

    private void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;

    }

    private Node reverseRecurssion(Node curr, Node prev) {

        if (curr.next == null) {
            head = curr;
            head.next = prev;
            return head;
        }

        Node next = curr.next;
        curr.next = prev;
        reverseRecurssion(next, curr);
        return head;

    }

    private void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }

    @Override
    public Iterator iterator() {

        return new DoublyLLIterator();
    }

    public static class Node {
        private String data;
        private Node next;
        private Node previous;

        Node(String data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }

        public String getData() {
            return this.data;
        }

    }

    private class DoublyLLIterator implements Iterator {
        Node pointer = head;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return pointer.next != null;
        }

        @Override
        public Node next() {
            pointer = pointer.next;
            return pointer;
        }

    }

}
