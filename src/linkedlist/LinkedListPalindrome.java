package linkedlist;

/* Raj Kumar Boddupally created on 7/12/2021 inside the package - linkedlist */

import java.util.Stack;

public class LinkedListPalindrome {

    public boolean isPalindrome(LinkedList.Node head) {
        Stack<LinkedList.Node> nodeStack = new Stack<>();
        LinkedList.Node node = head;
        while (node != null) {
            nodeStack.add(node);
            node = node.next;
        }
        node = head;
        while (node != null) {
            if (node.data != nodeStack.pop().data) {
                return false;
            }
            node = node.next;
        }
        return true;
    }

    public LinkedList.Node reverse(LinkedList.Node head) {
        LinkedList.Node current = head;
        LinkedList.Node previous = null;
        LinkedList.Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}
