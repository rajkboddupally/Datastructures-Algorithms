package linkedlist;

public class CopyListwithRandomPointer {


    // Definition for a Node.
    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node newHead = new Node(0);
        Node nextNode = newHead;
        newHead = newHead.next;

        while (head != null) {
            newHead = new Node(head.val);
            newHead.next = head.next;
            newHead.random = head.random;

            head = head.next;
            newHead = newHead.next;
        }
        Node temp = nextNode.next;
        while (temp != null) {
            System.out.println("Val " + temp.val + " next-" + temp.next + " random-" + temp.random);
            temp = temp.next;
        }
        return nextNode.next;
    }

}
