import java.util.List;

public class Matrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int maxI = matrix.size();
        int maxIPossible = maxI - 1;
        int maxJ = matrix.get(0).size();
        int maxJPossible = maxJ -1;

        for (int i = 0; i < maxI /2; i++) {
            for (int j = 0; j < maxJ / 2; j++) {
                sum += Math.max(Math.max(
                                matrix.get(i).get(j), matrix.get(maxIPossible-i).get(j)),
                        Math.max(matrix.get(maxIPossible-i).get(maxJPossible - j),
                                matrix.get(i).get(maxJPossible - j)));
            }
        }
        return sum;
    }
}
