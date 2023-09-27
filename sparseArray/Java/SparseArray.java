import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            int count = 0;
            for (String str : strings) {
                if (query.equals(str)) count++;
            }
            results.add(count);
        }
        return results;
    }
}
