package linkedlist;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int length = 0;

        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }
        if (length == 1) {
            return null;
        }
        ptr = head;
        ListNode result = ptr;
        int counter = 0;
        while (counter < length - n - 1) {
            ptr = ptr.next;
            counter++;
        }
        if (counter > length - n - 1) {
            result = result.next;
            return result;
        }
        ptr.next = ptr.next.next;

        return result;
    }
}
