package linkedlist;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

/*
Given the head of a linked list, rotate the list to the right by k places.



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]


Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 */

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null)
            return null;

        if (head.next == null)
            return head;

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode newHead = head;
        int length = 0;

        //1. Get the LL length
        while (current != null) {
            current = current.next;
            length++;
        }

        int totalRotations = length - k % length;
        if (totalRotations == length) {
            return newHead;
        }

        //2. Resetting current back to head.
        current = head;

        //3. initiate counter and increment.
        int counter = 0;
        while (counter < totalRotations && current != null) {
            prev = current;
            current = current.next;
            counter++;
        }

        if (prev != null) {
            next = prev.next;
            prev.next = null;
            newHead = next;
        }

        while (next != null && next.next != null) {
            next = next.next;
        }
        if (next != null)
            next.next = head;
        return newHead;
    }
}
