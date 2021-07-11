package linkedlist;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd_V1(ListNode head, int n) {
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

    /*
    Use 2 pointers  ptr and refPointer. Progress refPointer upto n and increment both ptr and refPointer.
    When refPointer reached end, update ptr.next = ptr.next.next and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode refPointer = head;
        ListNode pointer = head;
        ListNode res = pointer;

        //Forward refPointer to n
        int counter = 0;
        while (counter < n && refPointer != null) {
            refPointer = refPointer.next;
            counter++;
        }

        if (refPointer == null) {
            head = head.next;
            return head;
        }

        //Forward both refPointer and pointer until refPointer reached null.
        while (refPointer.next != null && pointer.next != null) {
            refPointer = refPointer.next;
            pointer = pointer.next;
        }
        assert pointer.next != null;
        pointer.next = pointer.next.next;
        return res;
    }
}
