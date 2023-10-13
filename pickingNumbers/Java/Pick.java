import java.util.Collections;
import java.util.List;

public class Pick {
        public static int pickingNumbers(List<Integer> a) {
            Collections.sort(a);
            int result = 0;
            int count = 0;
            int index = 0;

            for (int i = 1; i < a.size(); i++) {
                if (Math.abs(a.get(index) - a.get(i)) <= 1) {
                    count++;
                } else {
                    if (count > result) result = count;
                    count = 0;
                    index = i;
                }
            }
            return result > count ? ++result : ++count;
        }


}
