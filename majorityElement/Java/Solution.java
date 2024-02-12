import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majorityEl = nums[0];
        int maxCount = 0;

        for (int i = 0; i < nums.length-1; ) {
            int tempCount = 0;
            int index = i+1;

            while (nums[i] == nums[index]) {
                tempCount++;
                index++;
                if (index == nums.length) break;
            }

            if (tempCount > maxCount) {
                maxCount = tempCount;
                majorityEl = nums[i];
            }

            i = index;
        }

        return majorityEl;
    }
}
