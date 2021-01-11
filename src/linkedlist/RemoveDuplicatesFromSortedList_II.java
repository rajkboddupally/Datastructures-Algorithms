package linkedlist;

public class RemoveDuplicatesFromSortedList_II {

    public ListNode deleteDuplicates1(ListNode head) {
        ListNode output = new ListNode();
        ListNode temp = output;
        int previousVal = -300;
        while (head != null) {
            int currentVal = head.val;
            int nextVal = (head.next != null) ? head.next.val : -999;
            if (currentVal != previousVal && currentVal != nextVal) {
                output.next = new ListNode(currentVal);
                output = output.next;
            }
            head = head.next;
            previousVal = currentVal;
        }
        return temp.next;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode output = new ListNode();
        ListNode temp = output;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
                continue;
            }
            output.next = new ListNode(head.val);
            output = output.next;
            head = head.next;
        }
        return temp.next;
    }
}
