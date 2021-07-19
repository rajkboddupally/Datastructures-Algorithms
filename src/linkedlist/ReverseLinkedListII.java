package linkedlist;

/* Raj Kumar Boddupally created on 7/19/2021 inside the package - linkedlist */
/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]


Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n


Follow up: Could you do it in one pass?
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right)
            return head;

        if (head == null)
            return null;

        ListNode node = head;
        ListNode prev = null;
        int counter = 1;

        while (node != null && counter < left) {
            prev = node;
            node = node.next;
            counter++;
        }

        ListNode prevNode = null;
        ListNode nextNode;
        ListNode tempHead = null;
        while (node != null && counter <= right) {
            if (prevNode == null)
                tempHead = node;

            nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
            counter++;
        }
        if (prev != null)
            prev.next = prevNode;
        if (tempHead != null)
            tempHead.next = node;
        if (left == 1)
            head = prevNode;


        return head;
    }
}
