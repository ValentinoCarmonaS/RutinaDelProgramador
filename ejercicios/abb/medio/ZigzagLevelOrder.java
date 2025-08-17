package abb.medio;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import helpers.TreeNode;

/**
 * * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class ZigzagLevelOrder {
    /*
     * Given the root of a binary tree, return the zigzag level order traversal of
     * its nodes' values. (i.e., from left to right, then right to left for the next
     * level and alternate between).
     * 
     * Example 1:
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [[3],[20,9],[15,7]]
     *
     * Example 2:
     * Input: root = [1]
     * Output: [[1]]
     * 
     * Example 3:
     * Input: root = []
     * Output: []
     * 
     * Constraints:
     * The number of nodes in the tree is in the range [0, 2000].
     * -100 <= Node.val <= 100
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        boolean rightToLeft = false;

        while (!q.isEmpty()) {
            LinkedList<Integer> currentLvl = new LinkedList<>();
            int len = q.size();

            for (int i = 0; i < len; i++) {
                TreeNode node = q.removeFirst();

                if (rightToLeft)
                    currentLvl.addFirst(node.val);
                else
                    currentLvl.addLast(node.val);

                if (node.left != null)
                    q.addLast(node.left);
                if (node.right != null)
                    q.addLast(node.right);
            }

            ans.add(new ArrayList<>(currentLvl));
            rightToLeft = !rightToLeft;
        }

        return ans;
    }
}
