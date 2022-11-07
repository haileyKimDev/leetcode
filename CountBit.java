public class CountBit {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];//create an array

        for (int i = 0; i <= n; i++) {
            res[i] = solve(i); // enter the number of 1's binary representation of i
        }
        return res;
    }

    public int solve(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if(n%2==0) // if n is even,
            return solve(n/2); // find quotient again
        else return 1 + solve(n/2); // plus 1 with quotient
    }
}