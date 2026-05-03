// Problem: Move Zeroes
// Platform: LeetCode #283
// Approach: Two Pointers (In-place)
// Idea: Move non-zero elements forward while maintaining order
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
