package array.facil;

public class NumIdenticalPairs {

    /**
     * 1512. Number of Good Pairs
     * <p>
     * Solved
     * <p>
     * Given an array of integers nums, return the number of good pairs.
     * <p>
     * 
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     * <p>
     * 
     * 
     * 
     * Example 1:
     * <p>
     * 
     * Input: nums = [1,2,3,1,1,3]
     * <p>
     * Output: 4
     * <p>
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     * <p>
     * Example 2:
     * <p>
     * 
     * Input: nums = [1,1,1,1]
     * <p>
     * Output: 6
     * <p>
     * Explanation: Each pair in the array are good.
     * <p>
     * Example 3:
     * <p>
     * 
     * Input: nums = [1,2,3]
     * <p>
     * Output: 0
     * <p>
     * 
     * 
     * Constraints:
     * <p>
     * 
     * 1 <= nums.length <= 100
     * <p>
     * 1 <= nums[i] <= 100
     * <p>
     * 
     * @param nums Array of integers
     * @return The number of good pairs.
     *         A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */
    public int numIdenticalPairs(int[] nums) {
        if (nums == null)
            return 0;

        int[] frequency = new int[101];
        int goodPairs = 0;

        for (int num : nums) {
            goodPairs += frequency[num];
            frequency[num]++;
        }

        return goodPairs;
    }
}
