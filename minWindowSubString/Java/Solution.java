import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (tLen > sLen) {
            return "";
        }

        if (tLen == sLen) {
            if (s.equals(t)) return s;
            return "";
        }

        Map<String, Integer> myMap = Stream.of(t.split(""))
                .collect(Collectors.toMap(
                        x -> x,
                        String::length,
                        Integer::sum));

        int firstIndex = 0;
        int secondIndex = 0;
        boolean isContained = false;

        for (int j = tLen; j <= sLen; j++) {
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
            // System.out.println("after loop " + isContained);
            if (isContained) {
                firstIndex = j;
                break;
            }
        }

        if (!isContained) {
            // System.out.println("fhhhh" + isContained);
            return "";
        }


        for (int j = 0; j <= firstIndex; j++) {
            // System.out.println("in second loop " + firstIndex);
            Map<String, Integer> sub = Stream.of(s.substring(j, firstIndex).split(""))
                    .collect(Collectors.toMap(
                            x -> x,
                            String::length,
                            Integer::sum));


            for (Map.Entry<String, Integer> val : myMap.entrySet()) {
                // System.out.println(val.getKey() + " inner " + sub.get(val.getKey()) + "   " + isContained + val.getValue());
                if (sub.containsKey(val.getKey()) && sub.get(val.getKey()) == val.getValue()) {
                    isContained = true;
                } else {
                    System.out.println(sub.toString() + "second loop" + isContained);
                    isContained = false;
                    break;
                }
            }

            if (!isContained) {
                secondIndex = j - 1;
                // System.out.println(secondIndex + " index 2");
                break;
            }
        }


        return s.substring(secondIndex, firstIndex);
    }
}