package bt;

public class MaxDepth {
    TreeNode root;
    //[7,4,3,null,null,6,19]
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lHeight = maxDepth(root.left);
        int rHeight= maxDepth(root.right);
        System.out.println("height of the node "+ root.val + " lHeight:"+lHeight + "  rHeight:"+rHeight);
        if(lHeight > rHeight)
            return  lHeight+1;
        else
            return rHeight+1;
    }
}
