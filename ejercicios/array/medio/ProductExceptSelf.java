package array.medio;

public class ProductExceptSelf {
    
    /**
     * # 238. Product of Array Except Self
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/product-of-array-except-self/solutions/7592994/238-product-of-array-except-self-by-vair-ioqe
     * <p>
     * Given an integer array nums, return an array answer such that answer[i] is
     * equal to the product of all the elements of nums except nums[i].
     * <p>
     * 
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
     * integer.
     * <p>
     * 
     * You must write an algorithm that runs in O(n) time and without using the
     * division operation.
     * <p>
     * 
     * 
     * 
     * ### Example 1:
     * <p>
     * 
     * - Input: nums = [1,2,3,4]
     * <p>
     * - Output: [24,12,8,6]
     * <p>
     * ### Example 2:
     * <p>
     * 
     * - Input: nums = [-1,1,0,-3,3]
     * <p>
     * - Output: [0,0,9,0,0]
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * - 2 <= nums.length <= 105
     * <p>
     * - -30 <= nums[i] <= 30
     * <p>
     * - The input is generated such that answer[i] is guaranteed to fit in a 32-bit
     * integer.
     * <p>
     * 
     * 
     * _Follow up: Can you solve the problem in O(1) extra space complexity? (The
     * output array does not count as extra space for space complexity analysis.)_
     * <p>
     * 
     * @param nums Integer array.
     * @return Array answer such that answer[i] is
     *         equal to the product of all the elements of nums except nums[i].
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        if (nums == null || len < 2 || len > 100000) {
            throw new IllegalArgumentException("El array 'nums' debe existir y debe ser de longitud valida");
        }

        int[] ans = new int[len];
        ans[0] = 1;

        for (int i = 1; i < len; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}
