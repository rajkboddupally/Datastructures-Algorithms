package bt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxDepthTest {
    MaxDepth m;

    @BeforeEach
    void setUp() {
        m = new MaxDepth();
    }

    @Test
    void maxDepthUsingNullPointer() {

        Node original = new Node(7);
        original.left = new Node(4);
        original.right = new Node(3);
        original.left.left = null;
        original.left.right = null;
        original.right.left = new Node(6);
        original.right.right = new Node(19);

        Assertions.assertEquals(2, m.maxDepthUsingNullPointer(original));

    }

    @Test
    void maxDepthUsingNullPointer1() {
        MaxDepth tree = new MaxDepth();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);

        Assertions.assertEquals(3, m.maxDepthUsingNullPointer(tree.root));

    }
}
