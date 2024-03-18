import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 1) return 1;
        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));

        int arrows = 1;
        int i = 0;
        int j = 1;

        L1: while (j < points.length) {
            while (points[i][1] >= points[j][0]) {
                j++;
                if (j >= points.length) {
                    break L1;
                }
            }

            arrows++;
            i = j;
            j++;

        }

        return arrows;
    }
}