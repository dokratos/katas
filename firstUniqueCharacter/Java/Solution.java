import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
     public static void main(String[] strings) {
         new Solution().firstUniqChar("leetcode");
     }

// passing test but poor runtime. Should I study more?!
    public int firstUniqChar(String s) {
        int index = -1;
        Map<String, Integer> counting = Stream.of(s.split(""))
                .collect(Collectors.toMap(
                        x -> x,
                        String::length,
                        Integer::sum)
                );
        System.out.println(counting.get("e"));

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));

                 int value = counting.get(String.valueOf(s.charAt(i)));

                if (value == 1) {
                    return i;
                }
            }

        return index;
    }
}
