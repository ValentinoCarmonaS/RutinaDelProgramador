package array.facil;

public class FindNumbers {

    /**
     * # 1295. Find Numbers with Even Number of Digits
     * <p>
     * ####
     * Solved:
     * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/solutions/7592989/1295-find-numbers-with-even-number-of-di-fien
     * <p>
     * Given an array nums of integers, return how many of them contain an even
     * number of digits.
     * <p>
     * ### Example 1:
     * <p>
     * 
     * - Input: nums = [12,345,2,6,7896]
     * <p>
     * - Output: 2
     * <p>
     * #### Explanation:
     * <p>
     * - 12 contains 2 digits (even number of digits).
     * <p>
     * - 345 contains 3 digits (odd number of digits).
     * <p>
     * - 2 contains 1 digit (odd number of digits).
     * <p>
     * - 6 contains 1 digit (odd number of digits).
     * <p>
     * - 7896 contains 4 digits (even number of digits).
     * <p>
     * Therefore only 12 and 7896 contain an even number of digits.
     * <p>
     * ### Example 2:
     * <p>
     * 
     * - Input: nums = [555,901,482,1771]
     * <p>
     * - Output: 1
     * <p>
     * #### Explanation:
     * <p>
     * - Only 1771 contains an even number of digits.
     * <p>
     * ## Constraints:
     * <p>
     * 
     * - 1 <= nums.length <= 500
     * <p>
     * - 1 <= nums[i] <= 10^5
     * <p>
     * 
     * @param nums Array of integers
     * @return How many of them contain an even
     *         number of digits.
     */
    public int findNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("El Array 'nums' debe existir");
        }

        int count = 0;

        for (int num : nums) {
            if ((num >= 10 && num <= 99) ||
                    (num >= 1000 && num <= 9999) ||
                    (num == 100000)) {
                count++;
            }
        }
        return count;
    }
}
