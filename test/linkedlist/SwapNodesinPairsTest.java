package linkedlist;

import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/12/2021 inside the package - linkedlist */
class SwapNodesinPairsTest {
    SwapNodesinPairs snp = new SwapNodesinPairs();
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);


    @Test
    void swapPairs() {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        snp.swapPairs(node1);
    }

    @Test
    void swapPairs1() {
        snp.swapPairs(node1);
    }

    @Test
    void swapPairs2() {
        snp.swapPairs(null);
    }
}
