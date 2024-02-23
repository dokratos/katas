import java.util.*;


// Solution beats 5% of users, shall I improve it?...
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        if (trust.length == 0) return -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int[] citizen : trust) {
            map.computeIfAbsent(citizen[0], ArrayList::new).add(citizen[1]);
        }

        if (n - map.size() > 1) return -1;
        System.out.println(map.toString());
        Set<Integer> notJudge = map.keySet();
        List<List<Integer>> trusted = new ArrayList<>(map.values());

        L1: for (int i = 1; i <= n; i++) {
            if (!notJudge.contains(i)) {
                System.out.println(i);

                for (List<Integer> t : trusted) {
                    System.out.println(t.toString());
                    if (!t.contains(i)) {
                        continue L1;
                    }
                }
                System.out.println("hi");
                return i;
            }
        }

        return -1;
    }
}
