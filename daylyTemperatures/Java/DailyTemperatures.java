public class DailyTemperatures {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] answer = new int[temperatures.length];

            if (answer.length == 1) {
                return answer;
            }

            int currentValue = temperatures[0];
            int index = 0;
            int count = 0;


            for (int i = 1; i < temperatures.length; i++) {
                if (temperatures[i] > currentValue) {
                    for (int j = index; j < answer.length; j++) {
                        answer[j] = i - j;
                    }
                    index = i;
                }
            }


//            for (int temp : temperatures) {
//                if (temp != firstV) break;
//                count++;
//            }
//
//            for (int i = 0; i < temperatures.length; i++) {
//                for (int j = i+1; j < temperatures.length; j++) {
//                    if (count > j) j = count;
//
//                    if (temperatures[j] > temperatures[i]) {
//                        answer[i] = j - i;
//                        break;
//                    }
//                }
//            }

            return answer;
        }
    }
}
