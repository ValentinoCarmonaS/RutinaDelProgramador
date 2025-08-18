package Queue.medio;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    /*
     * [347]
     * Given an integer array nums and an integer k, return the k most frequent
     * elements. You may return the answer in any order.
     * 
     * Example 1:
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * 
     * Example 2:
     * Input: nums = [1], k = 1
     * Output: [1]
     * 
     * Constraints:
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     * k is in the range [1, the number of unique elements in the array].
     * It is guaranteed that the answer is unique.
     * 
     * Follow up: Your algorithm's time complexity must be better than O(n log n),
     * where n is the array's size.
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maxMap = new HashMap<>();
        for (int num : nums) {
            maxMap.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(maxMap.get(a), maxMap.get(b)));
        for (int num : maxMap.keySet()) {
            if (minHeap.size() < k)
                minHeap.offer(num);
            else {
                if (maxMap.get(minHeap.peek()) < maxMap.get(num)) {
                    minHeap.poll();
                    minHeap.offer(num);
                }
            }
        }

        int[] ans = new int[k];
        int idx = 0;
        while (!minHeap.isEmpty()) {
            ans[idx++] = minHeap.poll();
        }

        return ans;
    }
}
