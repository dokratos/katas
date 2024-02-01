import java.util.Arrays;

public class ThirdSolution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] answer = new int[nums.length/3][];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i+=3) {
            if (nums[i+2] - nums[i] > k) {
                return new int[0][0];
            } else {
                answer[i/3] = new int[]{nums[i], nums[i+1], nums[i+2]};
            }
        }
        return answer;
    }
}
