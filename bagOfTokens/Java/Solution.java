import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);

        int i = 0;
        int j = tokens.length - 1;

        while (i <= j) {
            if (tokens[i] <= power) {
                score++;
                power -= tokens[i];
                if (score > maxScore) {
                    maxScore = score;
                }
                i++;
                continue;
            }

            if (tokens[i] > power && score > 0) {
                power += tokens[j];
                score--;
                j--;
                continue;
            }

            if (tokens[i] > power && score == 0) {
                break;
            }
        }

        return maxScore;
    }
}
