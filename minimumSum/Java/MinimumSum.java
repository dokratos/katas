import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumSum {
    public static int minSum(List<Integer> num, int k) {

        PriorityQueue<Integer> results =
                new PriorityQueue<>(Collections.reverseOrder());
        
        results.addAll(num);
        for (int i = 0; i < k; i++) {
            double n = results.poll();
            n = Math.ceil(n / 2);
            results.add((int)n);
        }

        return results.stream().reduce(0, (a, b) -> a + b);
    }
}
