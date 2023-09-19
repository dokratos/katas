import java.util.List;

public class Main {
    public static void main(String arg[]) {

    }

    public static double plusMinus(List<Integer> arr) {
        double plus = 0;
        double minus = 0;
        double zeros = 0;

        for (Integer n : arr) {
            if (n == 0) {
                zeros++;
            }
            if (n > 0) {
                plus++;
            }
            if (n < 0) {
                minus++;
            }
        }
        double testResult = (double) (plus / arr.size());
        System.out.format("%.6f %n", (double) (plus / arr.size()));
        System.out.format("%.6f %n", (double) (minus / arr.size()));
        System.out.format("%.6f %n", (double) (zeros / arr.size()));
        return testResult;
    }
}
