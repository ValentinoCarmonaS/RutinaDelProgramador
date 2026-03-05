package array.medio;

import java.util.HashMap;

public class SubarraySum {

    /**
     * # 560. Subarray Sum Equals K
     * <p>
     * ####
     * Solved:
     * https://leetcode.com/problems/subarray-sum-equals-k/solutions/7628196/560-subarray-sum-equals-k-by-vairoxcs-xaye
     * <p>
     * Given an array of integers nums and an integer k, return the total number of
     * subarrays whose sum equals to k.
     * <p>
     * 
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * Input: nums = [1,1,1], k = 2
     * <p>
     * Output: 2
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: nums = [1,2,3], k = 3
     * <p>
     * Output: 2
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * 1 <= nums.length <= 2 * 104
     * <p>
     * -1000 <= nums[i] <= 1000
     * <p>
     * -107 <= k <= 107
     * <p>
     * 
     * @param nums Array of integers
     * @param k    Integer
     * @returnthe Total number of
     *            subarrays whose sum equals to k.
     */
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Integer> prefix = new HashMap<>(nums.length + 1, 1.0f);
        prefix.put(0, 1);

        int numSubarrays = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            int tempNum = sum - k;

            numSubarrays += prefix.getOrDefault(tempNum, 0);

            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }

        return numSubarrays;
    }
}
