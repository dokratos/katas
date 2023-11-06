import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
    public static String gridChallenge(List<String> grid) {
        int len = grid.get(0).length();
        List<String> sortedGrid = new ArrayList<>();
        for (String alpha : grid) {
            char[] c = alpha.toCharArray();
            Arrays.sort(c);
            sortedGrid.add(String.valueOf(c));
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < sortedGrid.size() - 1; j++) {
                if (sortedGrid.get(j + 1).charAt(i) < sortedGrid.get(j).charAt(i)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
