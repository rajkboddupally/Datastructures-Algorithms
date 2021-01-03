package bt;


/*
Find a Corresponding Node of a Binary Tree in a Clone of That Tree
Input: tree = [7,4,3,null,null,6,19], target = 3
Output: 3
Explanation: In all examples the original and cloned trees are shown. The target node is a green node
from the original tree. The answer is the yellow node from the cloned tree.

 */
public class TargetCopy {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }
        if (original.val == target.val) {
            return cloned;
        }
        TreeNode inLeft = getTargetCopy(original.left, cloned.left, target);
        if (inLeft != null) {
            return inLeft;
        }
        TreeNode inRight = getTargetCopy(original.right, cloned.right, target);
        return inRight;

    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}
