import java.util.Collections;
import java.util.List;

public class Lonely {
    public static int lonelyinteger(List<Integer> a) {
        if (a.size() == 1) return a.get(0);

        Collections.sort(a);
        for (int i = 0; i < a.size(); i += 2) {
            int j = i + 1;
            if (j == a.size()) return a.get(i);

            if (a.get(i) != a.get(j))
                return a.get(i);
        }
        return 0;
    }
}
