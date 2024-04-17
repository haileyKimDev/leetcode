public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // 배열의 길이로 k를 나눈 나머지를 구합니다.
        
        // 전체 배열을 뒤집습니다.
        reverse(nums, 0, n - 1);
        // 앞의 k 요소를 뒤집습니다.
        reverse(nums, 0, k - 1);
        // 나머지 부분을 뒤집습니다.
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
