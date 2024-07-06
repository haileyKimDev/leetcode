class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Calculate left products
        int[] left = new int[n];
        left[0] = 1;  // The first element has no left elements
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        // Step 2: Calculate right products and the result
        int[] right = new int[n];
        right[n - 1] = 1;  // The last element has no right elements
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        
        // Step 3: Multiply left and right products
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        
        return result;
    }
}
