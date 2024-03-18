import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 1) return 1;
        Arrays.sort(points, (a, b)-> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int arrows = 1;
        int i = 0;
        int j = 1;
        for (int[] num : points) {
            for (int n : num) {

                System.out.println(n);
            }
        }
        L1: while (j < points.length) {
            while (points[i][1] >= points[j][0]) {
                j++;
                System.out.println(i + " in loop 2" + j);
                if (j >= points.length) {
                    break L1;
                }
            }

            arrows++;
            System.out.println(j + " in loop" + arrows);
            i = j;
            j++;

        }

        // if (j < points.length && points[i][1] < points[j][0]) {
        //     arrows++;
        // }

        return arrows;
    }
}
