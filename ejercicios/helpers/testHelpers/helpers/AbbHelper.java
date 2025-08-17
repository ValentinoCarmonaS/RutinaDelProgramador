package helpers.testHelpers.helpers;

import java.util.LinkedList;
import java.util.Queue;

import abb.facil.IsSameTree;
import helpers.TreeNode;

public class AbbHelper {
    public static boolean areTreesEqual(TreeNode a, TreeNode b) {
        IsSameTree ist = new IsSameTree();
        return ist.isSameTree(a, b);
    }

    public static TreeNode createTreeFromArray(Integer[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

}
