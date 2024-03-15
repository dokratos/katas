public class AlgoSolution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left1 = 0, left2 = 0, sum1 = 0, sum2 = 0, index = 0, total = 0;
        int len = nums.length;

        while (index < len) {
            sum1 += nums[index];
            sum2 += nums[index];

            while (left1 <= index && sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }

            while (left2 <= index && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }

            total += left2 - left1;
            index++;
        }

        return total;
    }
}
