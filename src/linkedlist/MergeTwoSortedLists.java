package linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;

        while (l1 != null || l2 != null) {
            int val3;

            if (l1 == null) {
                val3 = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                val3 = l1.val;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                val3 = l2.val;
                l2 = l2.next;
            } else {
                val3 = l1.val;
                l1 = l1.next;
            }
            l3.next = new ListNode(val3);
            l3 = l3.next;
        }
        return head.next;
    }
}