import java.util.List;

public class SubArray {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        if (m == 1) {
            for (Integer square : s) {
                if ((int)square == d) count++;
            }
            return count;
        }

        for (int i = 0; i < s.size() - m + 1; i++) {
            int section = s.get(i);
            for (int j = 1; j < m; j++) {
                section += s.get(j + i);
            }
            if (section == d) count++;
        }
        return count;
    }
}
