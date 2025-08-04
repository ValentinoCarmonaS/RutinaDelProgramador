package stack.facil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import helpers.TreeNode;

public class InorderTraversal {

    /*
     *  Given the root of a binary tree, return the inorder traversal of its nodes' values.

        Example 1:
            Input: root = [1,null,2,3]
            Output: [1,3,2]

        Example 2:
            Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
            Output: [4,2,6,5,7,1,3,9,8]

        Example 3:
            Input: root = []
            Output: []

        Example 4:
            Input: root = [1]
            Output: [1]

        Constraints:
            The number of nodes in the tree is in the range [0, 100].
            -100 <= Node.val <= 100
        
        Follow up: Recursive solution is trivial, could you do it iteratively?
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        Map<TreeNode, Boolean> visit = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> q = new Stack<>();
        q.push(root);
        while(!q.empty()) {
            TreeNode node = q.pop();
            if (node == null) continue;
            if (visit.containsKey(node)) {
                ans.add(node.val);
                continue;
            }
            visit.put(node,true);
            q.push(node.right);
            q.push(node);
            q.push(node.left);
        }
        return ans;
    }
}
