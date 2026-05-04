// Problem: Maximum Subarray
// GFG: Kadane’s Algorithm
// Platform: LeetCode #53
// Difficulty: Medium
// Approach: Kadane's Algorithm
// Idea: Reset sum when it becomes negative and track maximum sum
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = 0;

        for(int num: nums){
            if(currentsum < 0){
                currentsum = 0;
            }
            currentsum += num;
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
}
