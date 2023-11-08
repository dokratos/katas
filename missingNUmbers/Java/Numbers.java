import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Numbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(brr);
        Collections.sort(arr);

        var set = new TreeSet<Integer>();
        int j = 0;
        for (int i = 0; i < brr.size(); i++) {
            if (j < arr.size() && brr.get(i).equals(arr.get(j))) {
                j++;
            } else {
                set.add(brr.get(i));
            }
        }
        // for (Integer el : arr) {
        //     Optional<Integer> common = brr.stream()
        //                         .filter(x -> el.equals(x))
        //                         .findAny();

        //     if (common.isPresent()) {
        //        brr.remove(common.get());
        //     }

        // }

        // return brr.stream().distinct().collect(Collectors.toList());
        return set.stream().collect(Collectors.toList());
    }
}
