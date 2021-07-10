package linkedlist;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - linkedlist */

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        LinkedList linkedList = new LinkedList();
        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        linkedList.printList();

        System.out.println("ADD FRONT ");
        Node node4 = new Node(5);
        linkedList.addFront(node4);
        linkedList.printList();


        System.out.println("ADD AFTER GIVEN NODE ");
        Node node5 = new Node(15);
        linkedList.add(node5, node1);
        linkedList.printList();

        System.out.println("ADD LAST ");
        Node node6 = new Node(100);
        linkedList.addLast(node6);
        linkedList.printList();
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " => ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    //1) At the front of the linked list
    public void addFront(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    //2) After a given node.
    public void add(Node newNode, Node givenNode) {
        if (givenNode != null) {
            Node node = givenNode.next;
            givenNode.next = newNode;
            newNode.next = node;
        }
    }

    //3) At the end of the linked list.
    public void addLast(Node newNode) {
        Node node = head;
        while (node != null && node.next != null) {
            node = node.next;
        }
        if (node != null) {
            node.next = newNode;
            newNode.next = null;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}