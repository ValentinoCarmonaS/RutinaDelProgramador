package abb.facil;

import helpers.TreeNode;

public class SortedArrayToBST {
    
    /*
     *  [108]
     *  Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
        
        Example 1:
            Input: nums = [-10,-3,0,5,9]
            Output: [0,-3,9,-10,null,5]
            Explanation: [0,-10,5,null,-3,null,9] is also accepted

        Example 2:
            Input: nums = [1,3]
            Output: [3,1]
            Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
        
        Constraints:
            1 <= nums.length <= 104
            -104 <= nums[i] <= 104
            nums is sorted in a strictly increasing order.
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return this.getChildren(nums, 0, nums.length-1);
    }

    private TreeNode getChildren(int[] nums, int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx) return null;

        int middle = (rightIdx + leftIdx) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        root.right = this.getChildren(nums, middle+1, rightIdx);
        root.left = this.getChildren(nums, leftIdx, middle-1);
        
        return root;
    }
}
