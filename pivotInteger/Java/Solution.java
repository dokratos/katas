class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        int upper = 0;
        for (int i = 1; i < n; i++) {
            upper += i;
        }
        for (int i = n-1; i > 0; i--) {

            n += i;

            if (n == upper) {
                return i;
            }
            upper = upper - i;
        }

        return -1;
    }
}
