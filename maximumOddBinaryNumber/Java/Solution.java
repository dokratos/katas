import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        StringBuilder joined = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            joined.append(charArray[i]);
        }

        return joined.substring(1) + joined.substring(0, 1);
    }
}