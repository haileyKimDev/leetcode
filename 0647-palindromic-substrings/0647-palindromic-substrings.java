class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Count palindromic substrings with odd lengths (single character as center)
            count += expandAroundCenter(s, i, i);
            // Count palindromic substrings with even lengths (two characters as center)
            count += expandAroundCenter(s, i, i + 1);
        }
        return count;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        // Expand around the center while the characters on both sides are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

}