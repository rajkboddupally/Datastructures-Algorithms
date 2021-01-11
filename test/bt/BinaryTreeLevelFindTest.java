package bt;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelFindTest {
    BinaryTreeLevelFind binaryTreeLevelFind = new BinaryTreeLevelFind();
    @BeforeEach
    void setUp() {
    }

    @Test
    void print() {

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.left.left = null;
        original.left.right = null;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        binaryTreeLevelFind.print(original);


    }
}