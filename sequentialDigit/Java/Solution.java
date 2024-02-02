import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowLen = (Integer.toString(low)).length();
        int highLen = (Integer.toString(high)).length();

        String maxValue = "123456789";
        ArrayList<Integer> result = new ArrayList<>();

        while (lowLen <= highLen) {
            for (int i = 0; i < 8; i++) {
                if (i+lowLen > 9) break;
                int value = Integer.parseInt(maxValue.substring(i, i+lowLen));
                if (low <= value && value <= high) {
                    result.add(value);
                }
            }
            lowLen++;
        }

        return result;
    }
}
