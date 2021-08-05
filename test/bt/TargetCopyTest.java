package bt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TargetCopyTest {

    @BeforeEach
    void setUp() {


    }

    @Test
    void getTargetCopy() {
        //[7,4,3,null,null,6,19]

        TargetCopy tree = new TargetCopy();

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.left.left = null;
        original.left.right = null;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode clone = new TreeNode(7);
        clone.left = new TreeNode(4);
        clone.right = new TreeNode(3);
        clone.left.left = null;
        clone.left.right = null;
        clone.right.left = new TreeNode(6);
        clone.right.right = new TreeNode(19);

        TreeNode target = new TreeNode(3);

        Assertions.assertEquals(3, tree.getTargetCopy(original, clone, target).val);

    }
}
