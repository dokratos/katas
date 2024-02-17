import java.util.Arrays;

public class Solution {
    public int minimumSum(int num) {
        int ones = num %  10; // Last digit
        int tens = (num /  10) %  10; // Second last digit
        int h = (num /  100) %  10; // Third digit
        int th = (num /  1000) %  10; // First digit

        int[] array = new int[]{ones, tens, h, th};
        Arrays.sort(array);

        int sum1 = array[0]*10 + array[3];
        int sum2 = array[1]*10 + array[2];

        return sum1+sum2;

    }
}
