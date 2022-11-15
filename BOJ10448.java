import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ10448 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //주어지는 자연수 개수
        int[] triNum = new int[45]; // 1000미만의 숫자
        for(int i = 1; i < 45; i++) {
            triNum[i] = i * (i + 1) / 2; //1000이 넘지않는 삼수
        }
        for(int i = 0; i < N; i++) { //주어지는 자연수 개수만큼 반복해서 숫자 받기
            int n = Integer.parseInt(br.readLine()); //입력받는 숫자
            int result =  eureka(n, triNum); // 삼각수의 합으로 가능한지 여부 조회
            System.out.println(result);
        }
    }

    public static int eureka(int N, int[] triNum) { //3개의 삼각수 합구하기
        for(int j = 1; j < 45; j++) { // 첫번째 삼각수
            for (int k = 1; k < 45; k++) { // 두번째 삼각수
                for (int z = 1; z < 45; z++) { //세번째 삼각수
                    int sum = triNum[j] + triNum[k] + triNum[z]; // 3개의 삼각수의 합을 구한다.
                    if (sum == N) { // 찾던숫자와 맞다면
                        return 1; //삼각수 합조합 가넝가넝 리턴
                    }
                }
            }
        }
        return 0;
    }
}