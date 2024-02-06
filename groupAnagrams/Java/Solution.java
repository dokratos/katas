import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashKeys = new HashMap<>();

        for (String str : strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String sub = new String(key);

            hashKeys.computeIfAbsent(sub, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(hashKeys.values());
    }
}
