package linkedlist;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]


Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 */

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode current = head;
        ListNode res = null;
        ListNode resHead = null;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            if (res == null) {
                resHead = current;
                res = current;
            }
            res.next = current.next;
            current = current.next;
            res = res.next;
        }
        return resHead;
    }
}
