class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int i = 0, j = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(j)); // j 위치의 문자를 제거
                j++; // 윈도우 시작점을 오른쪽으로 이동
            }
            set.add(c); // 새로운 문자를 윈도우에 추가
            maxLen = Math.max(maxLen, i - j + 1); // 최대 길이 갱신
            i++; // 윈도우 끝점을 오른쪽으로 이동
        }
        return maxLen;
    }
}