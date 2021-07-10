package linkedlist;

import org.junit.jupiter.api.Test;

class RemoveNthFromEndTest {
    RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

    @Test
    void removeNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode output = removeNthFromEnd.removeNthFromEnd(head, 2);
        while (output != null) {
            System.out.println(output.val + " -> ");
            output = output.next;
        }
    }

    @Test
    void removeNthFromEnd1() {
        ListNode head = new ListNode(1);


        ListNode output = removeNthFromEnd.removeNthFromEnd(head, 1);
        while (output != null) {
            System.out.println(output.val + " -> ");
            output = output.next;
        }

    }

    @Test
    void removeNthFromEnd2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode output = removeNthFromEnd.removeNthFromEnd(head, 2);
        while (output != null) {
            System.out.println(output.val + " -> ");
            output = output.next;
        }

    }
}
