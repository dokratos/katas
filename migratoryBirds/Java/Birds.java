import java.util.List;

public class Birds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] sightings = new int[6];

        for (Integer color : arr) {
            sightings[color] += 1;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < sightings.length; i++) {
            if (max < sightings[i]) {
                max = sightings[i];
                index = i;
            }
        }

        return index;
    }
}
