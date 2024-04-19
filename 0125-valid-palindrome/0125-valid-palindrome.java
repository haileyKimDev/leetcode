class Solution {
    public static boolean isPalindrome(String s) {
        // 정규 표현식을 사용하여 비알파벳 문자 제거 및 소문자로 변환
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 양 끝에서 시작하여 중앙으로 이동하면서 문자 비교
        int left = 0, right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false; // 양 끝의 문자가 다르면 회문이 아님
            }
            left++;  // 왼쪽 인덱스를 오른쪽으로 이동
            right--; // 오른쪽 인덱스를 왼쪽으로 이동
        }
        return true; // 모든 검사를 통과하면 회문임
    }

}