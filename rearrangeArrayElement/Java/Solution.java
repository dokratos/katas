import java.util.ArrayDeque;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        ArrayDeque<Integer> positives = new ArrayDeque();
        ArrayDeque<Integer> negatives = new ArrayDeque();

        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = positives.poll();
            } else {
                result[i] = negatives.poll();
            }
        }
        return result;
    }
}