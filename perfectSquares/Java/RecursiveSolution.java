// This solution comes from geeksforgeeks and works but times out on leetcode

public class RecursiveSolution {
    public int numSquares(int n) {
        if (n <= 3) return n;

        int res = n;

        for (int i = 1; i <= n; i++) {
            int temp = i*i;

            if (temp > n) {
                break;
            }

            res = Math.min(res, 1 + numSquares(n - temp));
        }

        return res;
    }
}
