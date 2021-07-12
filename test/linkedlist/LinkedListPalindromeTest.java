package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/12/2021 inside the package - linkedlist */

class LinkedListPalindromeTest {
    LinkedListPalindrome llp = new LinkedListPalindrome();
    LinkedList ll = new LinkedList();
    LinkedList.Node node1 = new LinkedList.Node(1);
    LinkedList.Node node2 = new LinkedList.Node(2);
    LinkedList.Node node3 = new LinkedList.Node(3);
    LinkedList.Node node4 = new LinkedList.Node(4);
    LinkedList.Node node5 = new LinkedList.Node(5);
    LinkedList.Node node6 = new LinkedList.Node(6);


    @Test
    void isPalindrome() {
        ll.clear();
        ll.addLast(node1);
        ll.addLast(node2);
        ll.addLast(node3);
        ll.addLast(node3);
        ll.addLast(node2);
        ll.addLast(node1);

        Assertions.assertTrue(llp.isPalindrome(ll.getHead()));

    }

    @Test
    void isPalindrome1() {
        ll.clear();
        ll.addLast(node1);
        ll.addLast(node2);
        ll.addLast(node3);


        Assertions.assertFalse(llp.isPalindrome(ll.getHead()));

    }

    @Test
    void isPalindrome3() {
        ll.clear();
        ll.addLast(node1);
        ll.addLast(node2);
        ll.addLast(node3);
        ll.addLast(node4);
        ll.addLast(node5);
        ll.addLast(node6);

        llp.reverse(ll.getHead());

    }
}
