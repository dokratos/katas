import java.util.Collections;
import java.util.List;

public class PermutingArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) return "NO";
        }
        return "YES";
    }
}
