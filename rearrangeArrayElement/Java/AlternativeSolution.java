public class AlternativeSolution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[pos] = nums[i];
                pos +=2;
            } else {
                result[neg] = nums[i];
                neg +=2;
            }
        }

        return result;
    }
}

// this solution is much more efficient than the first one, uses 1/3 of runtime
