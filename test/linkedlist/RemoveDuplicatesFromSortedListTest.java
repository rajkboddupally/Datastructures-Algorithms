package linkedlist;

import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList rdfs = new RemoveDuplicatesFromSortedList();

    @Test
    void deleteDuplicates1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(3);


        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = new ListNode(1);


        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }

    @Test
    void deleteDuplicates3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }

    @Test
    void deleteDuplicates4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);

        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }

    @Test
    void deleteDuplicates5() {
        ListNode head = null;

        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }

    @Test
    void deleteDuplicates6() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode node = rdfs.deleteDuplicates(head);

        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }
    }
}
