package linkedlist;

import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/19/2021 inside the package - linkedlist */

class ReverseLinkedListIITest {
    ReverseLinkedListII r = new ReverseLinkedListII();

    @Test
    void reverseBetween1() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        r.reverseBetween(head, 2, 4);

    }

    @Test
    void reverseBetween2() {

        ListNode head = new ListNode(5);
        r.reverseBetween(head, 1, 1);

    }

    @Test
    void reverseBetween3() {

        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        r.reverseBetween(head, 1, 2);

    }

    @Test
    void reverseBetween4() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        r.reverseBetween(head, 1, 2);

    }
}
