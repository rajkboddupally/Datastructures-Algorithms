package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 */
class Node {
    int val;
    Node next;
    boolean visited;

    Node() {
    }

    Node(int val) {
        this.val = val;
        this.visited = false;
    }
}

public class LinkedListLoop {

    public static void main(String[] args) {

        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        node.next.next.next.next = node.next.next;

        System.out.println(checkLoop(node));
    }

    private static boolean checkLoopV1(Node node) {

        Node head = node;

        while (head != null) {
            if (head.visited)
                return true;

            head.visited = true;
            head = head.next;
        }

        return false;
    }

    public static boolean checkLoop(Node head) {
        Set<Node> nodeSet = new HashSet<>();
        while (head != null) {
            if (nodeSet.add(head)) {
                head = head.next;
            } else {
                return true;
            }
        }

        return false;
    }
}
