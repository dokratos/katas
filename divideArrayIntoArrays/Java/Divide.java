import java.util.Arrays;

public class Divide {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length/3;
        int[][] answer = new int[n][3];

        Arrays.sort(nums);

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0, j = i+1; j < nums.length && i < nums.length; i++, j++) {
            if (secondIndex == 3) {
                secondIndex = 0;
                firstIndex++;
                // System.out.println(firstIndex + " " + secondIndex);
                answer[firstIndex][secondIndex] = nums[i];
                secondIndex++;
                continue;
            }

            if (secondIndex == 2) {
                if (nums[i] - answer[firstIndex][1] <= k && nums[i] - answer[firstIndex][0] <= k) {
                    answer[firstIndex][secondIndex] = nums[i];
                    secondIndex++;
                } else {
                    return new int[0][];
                }
            }

            if (secondIndex == 1) {
                if (nums[i] - answer[firstIndex][0] <= k) {
                    answer[firstIndex][secondIndex] = nums[i];
                    secondIndex++;
                } else {
                    return new int[0][];
                }
            }

            if (secondIndex == 0) {
                if (nums[j] - nums[i] <= k) {
                    // System.out.println(nums[j] + " J " + nums[i] + " i");
                    answer[firstIndex][secondIndex] = nums[i];
                    secondIndex++;
                } else {
                    return new int[0][];
                }
            }

            if (j == nums.length-1) {
                if (nums[j] - answer[firstIndex][1] <= k && nums[j] - answer[firstIndex][0] <= k) {

                    answer[firstIndex][secondIndex] = nums[j];
                    return answer;
                } else {
                    return new int[0][];
                }
            }
        }

        return answer;
    }
}
