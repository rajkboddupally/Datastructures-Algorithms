package bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxDepth {
    Node root;

    /*
    Approach
    1. Add root & null to QUEUE
    2. Iterate QUEUE
    3. POP element
        If it is null , increment counter. If QUEUE is not empty add null.
        else ADD LEFT and RIGHT trees to the QUEUE.
     */
    public int maxDepthUsingNullPointer(Node root) {

        if (root == null) return -1;

        int maxDepth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node == null) {
                maxDepth++;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return maxDepth - 1;
    }


}
