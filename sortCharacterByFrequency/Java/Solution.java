import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String frequencySort(String s) {
        Map<String, Integer> myMap = Stream.of(s.split(""))
                .collect(Collectors.toMap(
                        x -> x,
                        String::length,
                        Integer::sum));

        String[] strArray = new String[myMap.keySet().size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String chars = entry.getKey().repeat(entry.getValue());
            strArray[index]= chars;
            index++;
        }

        Arrays.sort(strArray, Comparator.comparing(String::length).reversed());

        return String.join("", strArray);
    }
}
