package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 */
class Node {
    private int index;

    int val;
    Node next;
    boolean visited;

    public int getVal() {
        return val;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    Node() {
    }

    Node(int val) {
        this.val = val;
        this.visited = false;
    }
}

public class LinkedListLoop {
    private Node head;

    public static void main(String[] args) {

        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(6);
        node.next.next.next.next.next = node.next;

        //System.out.println(checkLoop(node));

        //System.out.println(countNodesinLoop(node));
    }

    public void push(Node newNode) {
        Node node = head;
        if (node == null) {
            head = newNode;
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public void clear() {
        head = null;
    }

    public boolean checkLoopV1() {

        Node node = head;

        while (node != null) {
            if (node.visited)
                return true;

            node.visited = true;
            node = node.next;
        }

        return false;
    }

    public boolean checkLoop() {
        Node node = head;
        Set<Node> nodeSet = new HashSet<>();
        while (node != null) {
            if (nodeSet.add(node)) {
                node = node.next;
            } else {
                return true;
            }
        }

        return false;
    }

    /*
    Floyd cycle finding algorithm.
    Create 2 pointers, slow and fast. Increment slow by 1 and fast by 2
    If they meet at some point, then loop present
    else no loop
     */
    public boolean floydCycleFind() {
        Node sNode = head, fNode = head;
        while (sNode != null && fNode != null && fNode.next != null) {
            sNode = sNode.next;
            fNode = fNode.next.next;

            if (sNode == fNode)
                return true;
        }

        return false;
    }

    public int countNodesinLoop() {
        Node node = head;
        int nodeIndex = 0;
        int lastNodeIndex = 0;
        Set<Node> nodeSet = new HashSet<>();
        while (node != null) {
            if (nodeSet.add(node)) {
                node.setIndex(nodeIndex++);
                lastNodeIndex++;
                node = node.next;
            } else {
                return lastNodeIndex - node.getIndex();
            }
        }
        return 0;
    }
}
