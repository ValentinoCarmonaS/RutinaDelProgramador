"""
1636. Sort Array by Increasing Frequency

Given an array of integers nums, 
sort the array in increasing order based on the frequency of the values.
If multiple values have the same frequency, 
sort them in decreasing order.

Return the sorted array.

Example 1:
    Input: nums = [1,1,2,2,2,3]
    Output: [3,1,1,2,2,2]
    Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2:
    Input: nums = [2,3,1,3,2]
    Output: [1,3,3,2,2]
    Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3:
    Input: nums = [-1,1,-6,4,5,-6,1,4,1]
    Output: [5,-1,4,4,-6,-6,1,1,1]

Constraints:
    1 <= nums.length <= 100
    -100 <= nums[i] <= 100
"""

from typing import Counter, List


# class Solution(object):
#     def frequencySort(self, nums: List[int]) -> List[int]:
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         frequency = {}
#         for num in nums: #O(n)
#             frequency[num] = frequency.get(num, 0) + 1
        
#         ans = [] 
#         while frequency.__len__ != 0:
#             current = None
#             for key, value in frequency.items():
#                 if current == None:
#                     current = (key, value)
#                 else:
#                     if current[1] > value:
#                         current = (key, value)

#             if current == None: break

#             for _ in range(current[1]):
#                 ans.append(current[0])

#             frequency.pop(current[0])

#         return ans
        

class Solution(object):
    def frequencySort(self, nums: List[int]) -> List[int]:
        c = Counter(nums)
        nums.sort(key=lambda num: (c[num], -num))
        return nums


print(Solution().frequencySort([2,3,1,3,2]))