package bst;

/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.



Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1


Constraints:

The number of nodes in the tree is in the range [2, 104].
0 <= Node.val <= 105


 */

public class AbsoluteDifference {

    public int getMinimumDifference(TreeNode root) {
        int min = 106;
        int output = getMinimumDifference(root, min);

        return 0;
    }

    public int getMinimumDifference(TreeNode root, int min) {
        if(root != null){
            if(root.left != null){
                min = Math.min(min, (root.val - root.left.val));
            }
            if(root.right != null){
                min = Math.min(min, (root.val - root.right.val));
            }
        }
        return min;
    }
}
