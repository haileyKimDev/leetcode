class Solution {

    // Method to find the length of the longest consecutive sequence in the array
    // Time complexity: O(N log N) - Sorting the array takes O(N log N) time
    // Space complexity: O(1) - Apart from the input array, we are using constant extra space
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) { // If the array is empty, return 0
            return 0;
        }

        Arrays.sort(nums); // Sort the array, which takes O(N log N) time

        int longestStreak = 1; // Variable to store the length of the longest consecutive sequence
        int currentStreak = 1; // Variable to store the length of the current consecutive sequence

        for (int i = 1; i < nums.length; i++) { // Iterate through the sorted array
            if (nums[i] != nums[i - 1]) {
                 // Check if the current number is not a duplicate of the previous one
                if (nums[i] == nums[i - 1] + 1) { 
                    // If the current number is consecutive to the previous one
                    currentStreak += 1; // Increase the current sequence length
                } else { 
                    // Update the longest sequence length if the current streak is longer
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1; // Reset current streak for the next potential sequence
                }
            }
        }

        // Return the maximum of the longest streak and the current streak
        // This ensures the longest streak is returned, even if it was found at the end of the array
        return Math.max(longestStreak, currentStreak);
    }
}
