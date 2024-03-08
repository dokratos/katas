import java.util.Arrays;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];

        for (int num : nums) {
            frequency[num]++;
        }

        Arrays.sort(frequency);

        int maxFrequency = frequency[100];
        int result = frequency[100];

        for (int i = 99; i > 0; i--) {
            if (frequency[i] != maxFrequency) {
                break;
            }
            result += frequency[i];
        }

        return result;
    }
}
