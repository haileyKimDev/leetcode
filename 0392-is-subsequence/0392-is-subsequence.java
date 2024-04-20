class Solution {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;  // s의 다음 문자로 이동
            }
            tIndex++;  // t의 다음 문자로 이동
        }
        return sIndex == s.length();  // s의 모든 문자를 확인했는지 여부 반환
    }

}