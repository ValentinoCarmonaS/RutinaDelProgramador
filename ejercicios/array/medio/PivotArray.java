package array.medio;

public class PivotArray {

    /**
     * # 2161. Partition Array According to Given Pivot
     * <p>
     * ### Solved:
     * https://leetcode.com/problems/partition-array-according-to-given-pivot/solutions/7592963/2161-partition-array-according-to-given-s9ncv
     * <p>
     * - You are given a 0-indexed integer array nums and an integer pivot. Rearrange
     * nums such that the following conditions are satisfied:
     * <p>
     * 
     * - Every element less than pivot appears before every element greater than
     * pivot.
     * <p>
     * - Every element equal to pivot appears in between the elements less than and
     * greater than pivot.
     * <p>
     * - The relative order of the elements less than pivot and the elements greater
     * than pivot is maintained.
     * <p>
     * More formally, consider every pi, pj where pi is the new position of the ith
     * element and pj is the new position of the jth element. If i < j and both
     * elements are smaller (or larger) than pivot, then pi < pj.
     * Return nums after the rearrangement.
     * <p>
     * 
     * 
     * 
     * ### Example 1:
     * <p>
     * 
     * - Input: nums = [9,12,5,10,14,3,10], pivot = 10
     * <p>
     * - Output: [9,5,3,10,10,12,14]
     * <p>
     * #### Explanation:
     * <p>
     * - The elements 9, 5, and 3 are less than the pivot so they are on the left side
     * of the array.
     * <p>
     * - The elements 12 and 14 are greater than the pivot so they are on the right
     * side of the array.
     * <p>
     * - The relative ordering of the elements less than and greater than pivot is
     * also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
     * <p>
     * ### Example 2:
     * <p>
     * 
     * - Input: nums = [-3,4,3,2], pivot = 2
     * <p>
     * - Output: [-3,2,4,3]
     * <p>
     * #### Explanation:
     * <p>
     * - The element -3 is less than the pivot so it is on the left side of the array.
     * The elements 4 and 3 are greater than the pivot so they are on the right side
     * of the array.
     * <p>
     * - The relative ordering of the elements less than and greater than pivot is
     * also maintained. [-3] and [4, 3] are the respective orderings.
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * - 1 <= nums.length <= 105
     * <p>
     * - -106 <= nums[i] <= 106
     * <p>
     * - pivot equals to an element of nums.
     * <p>
     * 
     * @param nums  0-indexed integer array
     * @param pivot Every element equal to pivot appears in between the elements
     *              less than and
     *              greater than pivot. The relative order of the elements less than
     *              pivot and the elements greater
     *              than pivot is maintained.
     * @return Return nums after the rearrangement
     */
    public int[] pivotArray(int[] nums, int pivot) {
        if (nums == null) {
            throw new IllegalArgumentException("El array nums debe existir");
        }

        int[] result = new int[nums.length];
        int left = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[left++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                result[left++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[left++] = num;
            }
        }

        return result;
    }
}
