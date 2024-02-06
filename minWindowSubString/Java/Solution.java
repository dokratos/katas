import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (tLen > sLen) return "";

        Map<String, Integer> myMap = Stream.of(t.split(""))
                .collect(Collectors.toMap(
                        x -> x,
                        String::length,
                        Integer::sum));

        int firstIndex = 0;
        int secondIndex = sLen;
        boolean isContained = false;

        for (int j = tLen; j < sLen; j++) {
            Map<String, Integer> sub = Stream.of(s.substring(0, j).split(""))
                    .collect(Collectors.toMap(
                            x -> x,
                            String::length,
                            Integer::sum));

            for (Map.Entry<String, Integer> val : myMap.entrySet()) {
                if (sub.containsKey(val.getKey()) && sub.get(val.getKey()) == val.getValue()) {
                    isContained = true;
                } else {
                    isContained = false;
                    break;
                }
            }

            if (isContained) {
                firstIndex = j;
                break;
            }
        }

        if (!isContained) return "";

        for (int j = sLen - tLen; j > 0; j--) {
            Map<String, Integer> sub = Stream.of(s.substring(j).split(""))
                    .collect(Collectors.toMap(
                            x -> x,
                            String::length,
                            Integer::sum));

            for (Map.Entry<String, Integer> val : myMap.entrySet()) {
                if (sub.containsKey(val.keySet()) && sub.get(val.keySet()) == val.values()) {
                    isContained = true;
                } else {
                    isContained = false;
                    break;
                }
            }

            if (isContained) {
                secondIndex = j;
                break;
            }
        }

        return sLen - secondIndex > firstIndex ? s.substring(0, firstIndex) : s.substring(secondIndex);
    }
}