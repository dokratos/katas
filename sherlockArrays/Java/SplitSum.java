import java.util.List;

public class SplitSum {

    public static String balancedSums(List<Integer> arr) {
        int excl = arr.stream().reduce(0, (a, b) -> a + b);

        int leftSum = 0;

        for (Integer el : arr) {
            if (leftSum == excl - el - leftSum) {
                return "YES";
            }
            leftSum += el;
        }

        // if (excl == 0 || excl == arr.get(0) || excl == arr.get(arr.size() - 1)) {
        //     return "YES";
        // }

        // for (int i = 0, k = 1, j = 2; i < k && j < arr.size(); i++, k++, j++) {
        //     int sumOne = 0;
        //     int sumTwo = 0;
        //     for (int x = 0; x < k; x++) {
        //         sumOne += arr.get(x);
        //     }
        //     for (int y = j; y < arr.size(); y++) {
        //         sumTwo += arr.get(y);
        //     }
        //     if (sumOne == sumTwo) {
        //         return "YES";
        //     }
        // }
        return "NO";

    }
}
