import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }

        Map<Map<String, Integer>, List<String>> hashKeys = new HashMap<>();

        for (String str : strs) {
            Map<String, Integer> sub = Stream.of(str.split(""))
                    .collect(Collectors.toMap(
                            x -> x,
                            String::length,
                            Integer::sum));
            hashKeys.computeIfAbsent(sub, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(hashKeys.values());
    }
}
