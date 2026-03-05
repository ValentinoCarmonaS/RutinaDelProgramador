package array.facil;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * # 217. Contains Duplicate
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/contains-duplicate/solutions/7628121/217-contains-duplicate-by-vairoxcs-i6o1
     * <p>
     * 
     * Given an integer array nums, return true if any value appears at least twice
     * in the array, and return false if every element is distinct.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * Input: nums = [1,2,3,1]
     * <p>
     * 
     * Output: true
     * <p>
     * 
     * ### Explanation:
     * <p>
     * 
     * The element 1 occurs at the indices 0 and 3.
     * <p>
     * 
     * ## Example 2:
     * <p>
     * 
     * Input: nums = [1,2,3,4]
     * <p>
     * 
     * Output: false
     * <p>
     * 
     * ### Explanation:
     * <p>
     * 
     * All elements are distinct.
     * <p>
     * 
     * ## Example 3:
     * <p>
     * 
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * <p>
     * 
     * Output: true
     * <p>
     * 
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * 1 <= nums.length <= 105
     * <p>
     * -109 <= nums[i] <= 109
     * <p>
     * 
     * @param nums integer array
     * @return true if any value appears at least twice
     *         in the array, and return false if every element is distinct
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null)
            return false;

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
