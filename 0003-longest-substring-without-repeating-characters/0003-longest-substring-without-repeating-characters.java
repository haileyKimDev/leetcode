class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int i = 0, j = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, i - j + 1);
            i++;
        }
        return maxLen;
    }

}