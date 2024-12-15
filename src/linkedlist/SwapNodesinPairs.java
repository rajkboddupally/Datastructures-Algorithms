package linkedlist;

/* Raj Kumar Boddupally created on 7/12/2021 inside the package - linkedlist */

/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)



Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]


Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {

        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode prev = null;
        while(first!=null && second!= null){
            ListNode third = second.next;
            second.next = first;
            first.next = third;
            if(prev != null){
                prev.next = second;
            }else{
                head = second;
            }
            prev = first;
            first = first.next;
            if(first != null)
                second = first.next;
        }

        ListNode node = head;
        while (node != null) {
            System.out.println(node.val + " => ");
            node = node.next;
        }

        return head;

    }

    public ListNode swapPairs_v0(ListNode head) {

        //corner cases
        //1 head is null
        if (head == null) {
            return null;
        }
        //2 If only head exists
        if (head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode res = head.next;

        //reverse in pairs
        while (curr != null && curr.next != null) {
            prev = reverseInPairs(curr, curr.next, prev);

            curr = prev.next;

        }

        ListNode node = res;
        while (node != null) {
            System.out.println(node.val + " => ");
            node = node.next;
        }

        return res;
    }

    private ListNode reverseInPairs(ListNode first, ListNode second, ListNode prev) {
        ListNode nextNode = second.next;
        second.next = first;
        first.next = nextNode;
        if (prev != null)
            prev.next = second;
        return first;
    }
}
