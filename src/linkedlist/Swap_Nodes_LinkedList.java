package linkedlist;

/*
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]


Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
 */
public class Swap_Nodes_LinkedList {

    public ListNode swapNodes(ListNode head, int k) {

        int length=0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            length++;
        }


        int counter1 = 1;

        ListNode node1 = head;
        while(counter1 < k){
            node1 = node1.next;
            counter1++;
        }

        int counter2 = 1;

        ListNode node2 = head;
        while(counter2 <= length-k){
            node2 = node2.next;
            counter2++;
        }

        int temp = node1.val;
       node1.val = node2.val;
       node2.val = temp;

        return head;

    }

    public static void main(String[] args){
        Swap_Nodes_LinkedList snl = new Swap_Nodes_LinkedList();
        // [1,4,3,2,5]
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(2, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        snl.swapNodes(ln1, 2);
        snl.print(ln1);

    }

    private void print(ListNode head) {
        ListNode node = head;
        while(node != null){
            System.out.print( " "+node.val);
            node = node.next;
        }
    }

}

