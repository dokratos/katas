class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int end = 0;
        int countSub = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == goal) {
                countSub++;
                end = ++i;
                break;
            }
        }

        // System.out.println(sum + " sum " + end + " end");

        while (start < nums.length - 1) {
            while (end < nums.length - 1 && start < nums.length - 1) {
                System.out.println(end + " end " + countSub+ " count");
                sum += nums[end];

                if (sum == goal) {
                    countSub++;
                    end++;
                    // System.out.println(end + " end " + countSub+ " count in here");
                    // continue;
                }

                if (sum > goal) {
                    System.out.println(sum + " sum " + countSub+ " count in sum > goal");
                    sum = sum - nums[end];
                    end--;
                    System.out.println(sum + " sum " + countSub+ " count in sum > goal");
                }

                sum = sum - nums[start];
                start++;
                System.out.println(sum + " sum " + countSub+ " count in sum > goal");

                if (sum == goal) {
                    System.out.println(end + " end " + countSub+ " count in there");
                    countSub++;
                    while (sum == goal && start < nums.length - 1) {
                        System.out.println(end + " end " + countSub+ " count in whil");
                        sum = sum - nums[start];
                        start++;
                        if (sum == goal) countSub++;
                    }
                }
                end++;
            }
            System.out.println(sum + " sum " + countSub+ " count in sum > goal" + end + " end and start" + start);
            sum = sum - nums[start];

            if (sum < goal) {
                break;
            }

            if (sum == goal) {
                countSub++;
            }

            start++;
        }





        return countSub;
    }
}