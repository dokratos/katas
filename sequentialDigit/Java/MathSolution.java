import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathSolution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    result.add(num);
                }
                ++nextDigit;
            }
        }

        Collections.sort(result);
        return result;
    }
}
