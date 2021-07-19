package linkedlist;

/* Raj Kumar Boddupally created on 7/17/2021 inside the package - linkedlist */

/*
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.



Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]


Constraints:

The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200

 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode partitionNode = null, prevPartitionNode = null;

        ListNode node = head;
        ListNode prevNode = null;
        while (node != null) {
            if (node.val >= x && partitionNode == null) {
                partitionNode = node;
                prevPartitionNode = prevNode;
            }
            if (node.val < x && partitionNode != null) {
                ListNode nextNode = node.next;
                prevNode.next = nextNode;

                if (prevPartitionNode != null) {
                    prevPartitionNode.next = node;
                    prevPartitionNode = prevPartitionNode.next;
                }

                node.next = partitionNode;
                if (prevPartitionNode == null) {
                    head = node;
                    prevPartitionNode = node;
                }
                node = prevNode;
            }

            prevNode = node;
            node = node.next;
        }
        ListNode node1 = head;
        while (node1 != null) {
            System.out.print(node1.val + " => ");
            node1 = node1.next;
        }
        return head;
    }
}
