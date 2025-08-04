package abb.facil;

import helpers.TreeNode;

public class MaxDepth {
    
    /*
     *  Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        Example 1:
            Input: root = [3,9,20,null,null,15,7]
            Output: 3

        Example 2:
            Input: root = [1,null,2]
            Output: 2
        
        Constraints:
            The number of nodes in the tree is in the range [0, 104].
            -100 <= Node.val <= 100
     */
    public int maxDepth(TreeNode root) {
        return this.recMaxDepth(root, 0);
    }

    private int recMaxDepth(TreeNode root, int h) {
        if (root == null) return h + 0;
        int left = this.recMaxDepth(root.left, h + 1);
        int right = this.recMaxDepth(root.right, h + 1);
        return left > right ? left : right;
    }
}
