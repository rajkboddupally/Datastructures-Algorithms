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
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        LinkedList.Node node = prev;
        while (node != null) {
            System.out.print(node.data + "=>");
            node = node.next;
        }

        return prev;
    }

    public boolean isPalindromeReverse(LinkedList.Node head) {
        LinkedList.Node ascList = head;
        LinkedList.Node desList = reverse(head);

        while (ascList != null && desList != null) {
            if (ascList != desList)
                return false;

            ascList = ascList.next;
            desList = desList.next;
        }
        return true;
    }
}
