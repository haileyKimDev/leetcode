class Solution {
  public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      final int m = (left + right) / 2;
      if (nums[m] < nums[right])
        right = m;
      else
        left = m + 1;
    }

    return nums[left];
  }
}