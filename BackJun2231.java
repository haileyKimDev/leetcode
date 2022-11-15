import java.io.*;
public class BackJun2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;  //답
        for (int i = 1; i < n; i++) {
            int num = function(i);
            if (num == n) { //분해합이 n과 같으면 i는 n의 생성자가 된다
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }

    //분해합 구하는 함수
    static int function(int n) {
        int ret = n;
        while (n != 0) { // 10으로 나누었을때 몫이 0 이면 모든 자릿수 검사완
            ret += n % 10; // 10으로 나누고 나머지 더(n%10 :n의 1의 자리)
            n /= 10; // (n의 10의자리 숫자)
        }
        return ret;
    }
}