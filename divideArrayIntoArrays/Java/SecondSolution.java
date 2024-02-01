import java.util.Arrays;

public class SecondSolution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] answer = new int[nums.length/3][3];

        Arrays.sort(nums);

        int firstIndex = 0;

        for (int i = 0; i < nums.length - 2; i+=3) {
            if (nums[i+2] - nums[i] <= k) {
                answer[firstIndex][0] = nums[i];
                answer[firstIndex][1] = nums[i+1];
                answer[firstIndex][2] = nums[i+2];
                firstIndex++;
            } else {
                return new int[0][0];
            }

        }
        return answer;
    }
}
