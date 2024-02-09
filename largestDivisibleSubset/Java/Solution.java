import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> answer = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            LinkedList<Integer> temp = new LinkedList<>();
            temp.add(nums[i]);
            for (int j= i+1; j < nums.length; j++) {
                if (temp.getLast() % nums[j] == 0 || nums[j] % temp.getLast() == 0) {
                    temp.add(nums[j]);
                }
            }
            if (temp.size() > answer.size()) {
                answer = temp;
            }
        }

        return answer;
    }
}
