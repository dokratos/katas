class Solution {
    public int minimumLength(String s) {

        while (0 < s.length()-1) {
            int init = 0;
            int end = s.length()-1;

            if (s.charAt(init) != s.charAt(end)) {
                System.out.println(s.charAt(init));
                System.out.println(s.charAt(end));
                return s.length();
            }

            while (init < s.length()-2  && init < end && s.charAt(init) == s.charAt(init+1)) {
                init++;
            }

            while (end > 0 && s.charAt(end) == s.charAt(end-1) && end > init+1) {
                end--;
            }

            s = s.substring(init+1, end);
            System.out.println(s);
        }

        return s.length();
    }
}
