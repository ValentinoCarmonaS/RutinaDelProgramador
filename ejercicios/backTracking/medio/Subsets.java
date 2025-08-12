package backTracking.medio;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    /*
     *  [78]
        Given an integer array nums of unique elements, return all possible subsets (the power set).
        The solution set must not contain duplicate subsets. Return the solution in any order.
        
        Example 1:
            Input: nums = [1,2,3]
            Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
            
        Example 2:
            Input: nums = [0]
            Output: [[],[0]]
        
        Constraints:
            1 <= nums.length <= 10
            -10 <= nums[i] <= 10
            All the numbers of nums are unique.
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        if (nums.length == 0) return subsets; 

        this.recSubsets(0, subset, nums, subsets);
        return subsets;
    }

    private void recSubsets(int numIdx, List<Integer> subset, int[] nums, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(subset));
        
        if (numIdx == nums.length) return;

        for (int i = numIdx; i < nums.length; i++) {
            subset.add(nums[i]);
            
            this.recSubsets(i+1, subset, nums, subsets);
            subset.remove(subset.size()-1);
        }
    }
}
