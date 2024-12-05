package linkedlist;

public class GetNthElementFromEnd {
//1 2 4 8 5
    public ListNode getNthFromEnd(ListNode head, int n) {
        ListNode mainPtr = head;
        ListNode refPtr = head;

        int counter = 1;

        while(counter < n){
            refPtr = refPtr.next;
            counter++;
        }

        while(refPtr.next != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }


    return mainPtr;
    }

    public static void main(String[] args){
        GetNthElementFromEnd getNthElementFromEnd = new GetNthElementFromEnd();
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(2, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode ln0 = new ListNode(10, ln1);

        System.out.print(getNthElementFromEnd.getNthFromEnd(ln0, 4).val);


    }
}
