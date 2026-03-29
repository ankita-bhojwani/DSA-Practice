// Problem: Move Zeroes
// Approach: Two Pointer (slow-fast)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // position to place next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap current element with j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
