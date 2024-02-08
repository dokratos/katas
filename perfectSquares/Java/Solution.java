class Solution {
    public int numSquares(int n) {
        if (n <= 3) return n;

        int[] squares = new int[n+1];
        squares[0] = 0;
        squares[1] = 1;
        squares[2] = 2;
        squares[3] = 3;

        for (int i = 4; i <= n; i++) {
            squares[i] = i;


            for (int j = 1; j <= Math.ceil(
                    Math.sqrt(i)); j++) {
                int temp = j*j;

                if (temp > i) {
                    break;
                }

                squares[i] = Math.min(squares[i], 1 + squares[i - temp]);
            }
        }

        int res = squares[n];
        return res;
    }
}
