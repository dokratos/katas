public class Counter {
    public static String counterGame(long n) {
        if (n == 1) return "Richard";
        System.out.println(n + "N");
        int moves = 0;
        long pow;
        if ((n & (n - 1)) == 0) {
            pow = n;
        } else {
            long p = (long) Math.pow(2, Math.ceil((long)(Math.log(n) / Math.log(2))));
            moves += 1;
            pow = n - p;
            System.out.println(p + "p");
        }

        System.out.println(pow);

        while (pow != 1) {
            pow = pow / 2;
            System.out.println(pow + " while");
            moves++;
        }

        return moves % 2 == 0 ? "Richard" : "Louise";



    }
}
