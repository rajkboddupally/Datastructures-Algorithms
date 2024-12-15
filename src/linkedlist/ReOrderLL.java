package linkedlist;

import org.w3c.dom.NodeList;

public class ReOrderLL {

    public void reorderList_vo(ListNode head) {

        ListNode prev = null;
        ListNode clonedHead = null;
        ListNode curr = head;
        ListNode next = null;
        int length = 0;
        while(curr != null){
            ListNode node = new ListNode(curr.val);
            if(prev != null){
                prev.next = node;
            }else{
                clonedHead = node;
            }
            prev = node;
            curr = curr.next;
            length++;
        }
        curr = head;
        prev = null;
        next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int counter = 0;
        ListNode finalList = null;
        ListNode clonedHeadptr = clonedHead;
        ListNode prevNode =null;
        while(counter < length){
            if(counter%2==0){
                ListNode ln = new ListNode(clonedHeadptr.val);
                if(prevNode != null)
                    prevNode.next = ln;
                else
                    finalList = ln;
                prevNode = ln;
                clonedHeadptr = clonedHeadptr.next;
            }else{
                ListNode ln1 = new ListNode(prev.val);
                prevNode.next = ln1;
                prevNode = ln1;
                prev = prev.next;
            }
            counter++;
        }
        head = finalList;
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

/*
Approach
    1. Find the mid element using fast & slow pointer
    2. Reverse the list from mid element
    3. Iterate through midList and reassign the pointers
        node 1 = head.next
        node 2 = mid.next
        head.next = mid
        mid.next = node 1
        mid = node2
        head = node 1
 */
    public void reorderList(ListNode head) {

        ListNode slowptr = head;
        ListNode fastptr = head;

        while(fastptr.next != null && fastptr.next.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        ListNode mid = slowptr;
        mid = reverseList(mid);

        while(mid != null){
            ListNode node1= head.next;
            ListNode node2 = mid.next;

            head.next = mid;
            mid.next = node1;

            head = node1;
            mid = node2;
        }

    }

    private ListNode reverseList(ListNode mid) {
        ListNode prev=null, next;
        while(mid != null){
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReOrderLL reOrderLL = new ReOrderLL();
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        reOrderLL.reorderList(ln2);;
    }

}
