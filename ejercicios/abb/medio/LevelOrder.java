package abb.medio;

import java.util.ArrayList;
import java.util.LinkedList;

import helpers.TreeNode;

import java.util.List;
import java.util.Queue;

public class LevelOrder {

    /**
     * # 102. Binary Tree Level Order Traversal
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/binary-tree-level-order-traversal/solutions/7628105/102-binary-tree-level-order-traversal-by-5r8e
     * <p>
     * Given the root of a binary tree, return the level order traversal of its
     * nodes' values. (i.e., from left to right, level by level).
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * 
     * Input: root = [3,9,20,null,null,15,7]
     * <p>
     * Output: [[3],[9,20],[15,7]]
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: root = [1]
     * <p>
     * Output: [[1]]
     * <p>
     * ## Example 3:
     * <p>
     * 
     * Input: root = []
     * <p>
     * Output: []
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * The number of nodes in the tree is in the range [0, 2000].
     * <p>
     * -1000 <= Node.val <= 1000
     * <p>
     * 
     * @param root of a binary tree
     * @return the level order traversal of its 'nodes' values
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null)
            return levelOrder;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> lvlVals = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                lvlVals.add(node.val);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            levelOrder.add(lvlVals);
        }

        return levelOrder;
    }
}
