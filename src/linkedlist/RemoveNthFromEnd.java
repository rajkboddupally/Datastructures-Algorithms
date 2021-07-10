package linkedlist;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode i = head, j = head;
        ListNode output = i;
        int length = 1;
        int iIndex = 1;
        outerloop:
        while (i != null) {

            int counter = n;
            while (j != null && counter > 0) {
                j = j.next;
                counter--;
                if (j != null) {
                    length++;
                } else {
                    break outerloop;
                }
            }
            i = i.next;
            iIndex++;
        }
        while (iIndex < length - n) {
            iIndex++;
            i = i.next;
        }
        if (i.next != null) {
            i.next = i.next.next;
        }
        return output;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        ListNode reverseLLHead = null;

        //Reverse LinkedList

        while (ptr != null) {
            reverseLLHead = new ListNode(ptr.val);
            ptr = ptr.next;
        }
        return reverseLLHead;
    }
}
