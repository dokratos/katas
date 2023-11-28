public class Counter {
    public static String counterGame(long n) {
        int moves = 0;
        long pow = Long.toBinaryString(n - 1).length();
//         long pow = (long)(Math.log(n) /
//                   Math.log(2));

//        if ((n & (n - 1)) == 0) {
//            pow = n;
//        } else {
//            pow = (1 << (Long.toBinaryString(n).length() - 1));
//        }
//
//        System.out.println(n + " N");
//        System.out.println(pow);
//
//        while (pow != 1) {
//            pow = pow / 2;
//            moves++;
//        }
//        System.out.println(moves);
        return pow % 2 == 0 ? "Richard" : "Louise";



    }
}
