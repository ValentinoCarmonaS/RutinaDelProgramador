package search.medio;

public class SearchRange {

    /*
     * [34]
     * Given an array of integers nums sorted in non-decreasing order, find the
     * starting and ending position of a given target value.
     * 
     * If target is not found in the array, return [-1, -1].
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * Example 1:
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * 
     * Example 2:
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * Example 3:
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     * 
     * Constraints:
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * nums is a non-decreasing array.
     * -109 <= target <= 109
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        if (nums[0] == nums[nums.length - 1] && nums[0] != target)
            return new int[] { -1, -1 };
        if (nums[0] == nums[nums.length - 1] && nums[0] == target)
            return new int[] { 0, nums.length - 1 };

        int[] ans = new int[2];
        ans[0] = this.binarySearch(nums, target, true);
        ans[1] = this.binarySearch(nums, target, false);

        return ans;
    }

    private int binarySearch(int[] nums, int target, boolean searchFirst) {
        int leftIdx = 0, rightIdx = nums.length - 1;
        int targetIdx = -1;

        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            int num = nums[midIdx];

            if (num == target) {
                targetIdx = midIdx;
                if (searchFirst)
                    rightIdx = midIdx - 1;
                else
                    leftIdx = midIdx + 1;
            }

            if (num > target)
                rightIdx = midIdx - 1;
            if (num < target)
                leftIdx = midIdx + 1;
        }

        return targetIdx;
    }
}
