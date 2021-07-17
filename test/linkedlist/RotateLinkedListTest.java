package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

class RotateLinkedListTest {
    RotateLinkedList rotateLinkedList = new RotateLinkedList();

    ListNode node0 = new ListNode(0);
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    @Test
    void rotateRight1() {
        ListNode res = new ListNode(4);
        res.next = new ListNode(5);
        res.next.next = new ListNode(1);
        res.next.next.next = new ListNode(2);
        res.next.next.next.next = new ListNode(3);

        ListNode head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;
        head.next.next.next.next = node5;

        int k = 2;
        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        //compare 2 lists
        while (rotatedList != null && res != null) {
            if (rotatedList.val != res.val) {
                Assertions.fail();
                return;
            }
            rotatedList = rotatedList.next;
            res = res.next;
        }
        Assertions.assertNull(rotatedList);
    }

    @Test
    void rotateRight2() {

        ListNode res = new ListNode(0);
        res.next = new ListNode(1);
        res.next.next = new ListNode(2);

        ListNode head = node0;
        head.next = node1;
        head.next.next = node2;

        int k = 3;
        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        //print
        ListNode node = rotatedList;
        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }

        //compare 2 lists
        while (rotatedList != null && res != null) {
            if (rotatedList.val != res.val) {
                Assertions.fail();
                return;
            }
            rotatedList = rotatedList.next;
            res = res.next;
        }
        Assertions.assertNull(rotatedList);
    }

    @Test
    void rotateRight3() {
        ListNode res = new ListNode(2);
        res.next = new ListNode(0);
        res.next.next = new ListNode(1);

        ListNode head = node0;
        head.next = node1;
        head.next.next = node2;

        int k = 4;
        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        //print
        ListNode node = rotatedList;
        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }

        //compare 2 lists
        while (rotatedList != null && res != null) {
            if (rotatedList.val != res.val) {
                Assertions.fail();
                return;
            }
            rotatedList = rotatedList.next;
            res = res.next;
        }
        Assertions.assertNull(rotatedList);
    }

    @Test
    void rotateRight4() {
        ListNode res = new ListNode(1);

        ListNode head = node1;

        int k = 0;
        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        //print
        ListNode node = rotatedList;
        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }

        //compare 2 lists
        while (rotatedList != null && res != null) {
            if (rotatedList.val != res.val) {
                Assertions.fail();
                return;
            }
            rotatedList = rotatedList.next;
            res = res.next;
        }
        Assertions.assertNull(rotatedList);
    }

    @Test
    void rotateRight5() {
        ListNode res = new ListNode(1);
        res.next = new ListNode(2);

        ListNode head = node1;
        head.next = node2;

        int k = 0;
        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        //print
        ListNode node = rotatedList;
        while (node != null) {
            System.out.print(node.val + " => ");
            node = node.next;
        }

        //compare 2 lists
        while (rotatedList != null && res != null) {
            if (rotatedList.val != res.val) {
                Assertions.fail();
                return;
            }
            rotatedList = rotatedList.next;
            res = res.next;
        }
        Assertions.assertNull(rotatedList);
    }
}
