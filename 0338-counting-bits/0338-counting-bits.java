public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int offset = 1; // 현재 범위 내에서 가장 높은 2의 거듭제곱

        for (int i = 1; i <= n; i++) {
            if (i == offset * 2) {
                offset = i; // 가장 높은 2의 거듭제곱을 갱신
            }
            ans[i] = 1 + ans[i - offset];
        }
        return ans;
    }
}
