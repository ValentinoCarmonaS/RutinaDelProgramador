package array.facil;

public class GetConcatenation {

    /**
     * 1929. Concatenation of Array
     * Solved
     * Given an integer array nums of length n, you want to create an array ans of
     * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
     * (0-indexed).
     * 
     * Specifically, ans is the concatenation of two nums arrays.
     * 
     * Return the array ans.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * Example 2:
     * 
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     * 
     * 
     * Constraints:
     * 
     * n == nums.length
     * 1 <= n <= 1000
     * 1 <= nums[i] <= 1000
     * 
     * @param nums
     * @return
     */
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;

        if (nums == null || len > 1000 || len < 1) {
            throw new IllegalArgumentException("La longitud de 'nums' debe estar entre 1 y 1000");
        }

        int[] ans = new int[len * 2];

        System.arraycopy(nums, 0, ans, 0, len);
        System.arraycopy(nums, 0, ans, len, len);

        return ans;
    }
}
