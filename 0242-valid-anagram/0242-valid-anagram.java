class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];  // Create an array to count the frequency of each letter (assuming only lowercase a-z)
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;  // Increment the count for the corresponding character in s
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;  // Decrement the count for the corresponding character in t
        }
        
        // Check if any character has a non-zero frequency
        for (int val : count) {
            if (val != 0) {  // If any count is not zero, the strings are not anagrams
                return false;
            }
        }
        
        return true;  // If all counts are zero, the strings are anagrams
    }
}
