import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 1) {
            result.add(List.of(strs[0]));
            return result;
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

        for (Map.Entry<Map<String, Integer>, List<String>> hashKey : hashKeys.entrySet()) {
            result.add(hashKey.getValue());
        }
//            hashKeys.add(sub);
//        }
//
//        hashKeys = hashKeys.stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        for (Map<String, Integer> hashkey: hashKeys) {
//            List<String> group = new ArrayList<>();
//            for (String str : strs) {
//                Map<String, Integer> sub = Stream.of(str.split(""))
//                        .collect(Collectors.toMap(
//                                x -> x,
//                                String::length,
//                                Integer::sum));
//                if (hashkey.equals(sub)) {
//                    group.add(str);
//                }
//            }
//            result.add(group);
//        }

        return result;
    }
}
