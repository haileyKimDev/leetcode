import java.util.Scanner;

class BOJ1182 {
    static int[] num;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        dfs(0, 0);
        if (S == 0) System.out.println(answer - 1);
            // when S is o , the answer (total sum) is overlap, so it would be -1
        else  System.out.println(answer);

    }

    private static void dfs(int depth, int sum) {
        if (depth == N) { //if depth is the same with N
            if (sum == S) answer++; // add answer
            return;
        }
        dfs(depth + 1, sum + num[depth]);
        dfs(depth + 1, sum);
    }
}