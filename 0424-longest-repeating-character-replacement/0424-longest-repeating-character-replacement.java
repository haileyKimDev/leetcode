class Solution {
    public int characterReplacement(String s, int k) {
        // Create a map to store the frequency of each character.
        Map<Character, Integer> map = new HashMap<>();
        
        // Initialize the left pointer of the sliding window.
        int left = 0;
        
        // Store the frequency of the most frequently repeated character in the current window.
        int maxRepeat = 0;
        
        // Store the length of the longest valid window.
        int maxWindow = 0;

        // Expand the window by moving the right pointer of the string.
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // Increment the frequency of the current character.
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Update the frequency of the most frequently repeated character in the current window.
            maxRepeat = Math.max(maxRepeat, map.get(ch));

            // Check the condition to maintain a valid window.
            if (right - left + 1 - maxRepeat > k) {
                // If the length of the window minus the frequency of the most repeated character exceeds k, shrink the window from the left.
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }

            // Calculate the length of the current valid window and update the longest window length.
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        // Return the length of the longest valid window.
        return maxWindow;
    }

}