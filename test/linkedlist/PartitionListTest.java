package linkedlist;

import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

class PartitionListTest {
    PartitionList p = new PartitionList();

    @Test
    void partition() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        p.partition(head, 3);
    }

    @Test
    void partition1() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        p.partition(head, 2);
    }

    @Test
    void partition2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(2);
        p.partition(head, 3);
    }
}
