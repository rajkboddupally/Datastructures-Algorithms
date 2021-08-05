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
    void maxDepth() {

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.left.left = null;
        original.left.right = null;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        Assertions.assertEquals(3, m.maxDepth(original));

    }
}
