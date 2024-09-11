class Solution {
  public int findMin(int[] nums) {
    // Step 1: Initialize two pointers, left and right
    int left = 0;
    int right = nums.length - 1;

    // Step 2: Perform binary search
    while (left < right) {
      // Calculate the middle index
      final int middle = (left + right) / 2;

      // If middle element is less than rightmost element, the minimum is on the left
      if (nums[middle] < nums[right])
        right = middle; // Move the right pointer to middle
      else
        left = middle + 1; // Minimum is on the right side, move left pointer forward
    }

    // Step 3: Return the minimum element found
    return nums[left];
  }
}
//Time :O(LogN)
//Space : O(1)