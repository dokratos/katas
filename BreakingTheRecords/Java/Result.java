import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void main(String arg[]) {}
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList();
        int countMin = 0;
        int countMax = 0;
        int min = scores.get(0);
        int max = scores.get(0);

        for (Integer score : scores) {
            if (score > max) {
                max = score;
                countMax++;
            }
            if (score < min) {
                min = score;
                countMin++;
            }
        }

        result.add(countMax);
        result.add(countMin);

        return result;

    }
}
