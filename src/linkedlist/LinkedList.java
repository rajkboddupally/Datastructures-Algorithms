package linkedlist;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - linkedlist */

public class LinkedList {
    Node head;
    int length;

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        LinkedList linkedList = new LinkedList();
        linkedList.addFront(node1);
        linkedList.addLast(node2);
        linkedList.addLast(node3);
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

        System.out.println("REMOVE NODE 30 ");
        linkedList.delete(node3);
        linkedList.printList();

        System.out.println("REMOVE NODE 5 ");
        linkedList.delete(node4);
        linkedList.printList();

        System.out.println("REMOVE AT POSITION 3");
        linkedList.deleteAtPosition(3);
        linkedList.printList();

        System.out.println("REMOVE AT POSITION 0");
        linkedList.deleteAtPosition(0);
        linkedList.printList();
    }

    public void printList() {
        System.out.println("List length " + getLength());
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
        length++;
    }

    //2) After a given node.
    public void add(Node newNode, Node givenNode) {

        assert givenNode != null;
        newNode.next = givenNode.next;
        givenNode.next = newNode;
        length++;

    }

    //3) At the end of the linked list.
    public void addLast(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        newNode.next = null;
        length++;
    }

    //4. Delete a given node
    public void delete(Node givenNode) {
        Node node = head;

        //if head itself the givenNode
        if (head == givenNode) {
            head = head.next;
            length--;
            return;
        }

        while (node != null && node.next != givenNode) {
            node = node.next;
        }

        assert node != null;
        node.next = givenNode.next;
        length--;
    }

    //5. Delete at given position
    public void deleteAtPosition(int position) {
        if (position >= this.length)
            throw new IllegalArgumentException("position index cant be greater than LL length");
        length--;
        Node node = head;
        //if position is 0, then remove head
        if (position == 0) {
            head = head.next;
        }

        int counter = 0;
        while (counter < position - 1) {
            counter++;
            node = node.next;
        }
        //corner case - if node.next is null
        if (node.next != null && node.next.next == null) {
            node.next = null;
            return;
        }
        node.next = node.next.next;
    }

    public int getLength() {
        return this.length;
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
