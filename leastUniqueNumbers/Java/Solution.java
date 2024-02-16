import java.util.*;
import java.util.stream.Collectors;

public class Solution {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int n: arr) {
                map.merge(n, 1, Integer::sum);
            }

            LinkedList<Integer> val = new LinkedList<>(map.values());
            Collections.sort(val);

            while (k > 0) {
                int el = val.element();
                if (el - k < 1) {
                    val.pollFirst();
                }
                k = k - el;
            }
            return val.size();
        }
    }
}
