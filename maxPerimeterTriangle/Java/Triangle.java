import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Triangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        ArrayList<Integer> triangle = new ArrayList<>();
        Collections.sort(sticks, Collections.reverseOrder());

        for (int i = 0; i < sticks.size() - 2; i++) {
            for (int j = i+1; j < sticks.size() - 1; j++) {
                for (int x = j+1; x < sticks.size(); x++) {
                    Integer b = sticks.get(i);
                    Integer a = sticks.get(j);
                    Integer c = sticks.get(x);

                    if (a < b+c && b < c+a && c < a+b) {
                        triangle.add(c);
                        triangle.add(a);
                        triangle.add(b);
                        return triangle;
                    }
                }
            }
        }

        triangle.add(-1);
        return triangle;

    }


}
