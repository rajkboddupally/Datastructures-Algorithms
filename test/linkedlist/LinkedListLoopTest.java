package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/12/2021 inside the package - linkedlist */

class LinkedListLoopTest {
    LinkedListLoop linkedListLoop = new LinkedListLoop();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);

    @Test
    void main() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);
        node4.next = node2;
        Assertions.assertTrue(linkedListLoop.checkLoopV1());
    }

    @Test
    void main2() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);

        Assertions.assertFalse(linkedListLoop.checkLoop());
    }

    @Test
    void main3() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);
        linkedListLoop.push(node5);
        linkedListLoop.push(node6);
        node5.next = node2;

        Assertions.assertEquals(4, linkedListLoop.countNodesinLoop());
    }

    @Test
    void main4() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);
        linkedListLoop.push(node5);
        linkedListLoop.push(node6);
        node5.next = node5;

        Assertions.assertEquals(1, linkedListLoop.countNodesinLoop());
    }

    //Floyd cycle find
    @Test
    void main5() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);
        linkedListLoop.push(node5);
        linkedListLoop.push(node6);
        node5.next = node5;

        Assertions.assertTrue(linkedListLoop.floydCycleFind());
    }

    //Floyd cycle find
    @Test
    void main6() {
        linkedListLoop.clear();
        linkedListLoop.push(node1);
        linkedListLoop.push(node2);
        linkedListLoop.push(node3);
        linkedListLoop.push(node4);
        linkedListLoop.push(node5);
        linkedListLoop.push(node6);

        Assertions.assertFalse(linkedListLoop.floydCycleFind());
    }
}
