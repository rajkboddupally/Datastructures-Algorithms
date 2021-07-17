package linkedlist;

import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/14/2021 inside the package - linkedlist */

class ReverseNodesinKGroupTest {
    ReverseNodesinKGroup r = new ReverseNodesinKGroup();

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    @Test
    void reverseKGroup() {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        r.reverseKGroup(node1, 3);

    }
}
