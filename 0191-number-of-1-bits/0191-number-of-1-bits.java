public class Solution {
    public int hammingWeight(int n) {
        int count = 0 ;
        while(n!=0){//2진수구하기
            n = n & (n-1); //이전 숫자와 & 계산을 한다. 
            //n의 가장 오른쪽에 있는 1 비트가 0으로 변경된다.
            count++;
        }
        return count;
    }
}