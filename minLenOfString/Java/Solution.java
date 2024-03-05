class Solution {
    public int minimumLength(String s) {
        int init = 0;
        int end = s.length()-1;

        while(init < end){
            if(s.charAt(init) != s.charAt(end)){
                break;
            }
            char ref = s.charAt(init);
            while(init <= end && s.charAt(end) == ref){
                end--;
            }
            while(init <= end && s.charAt(init) == ref){
                init++;
            }
        }

        return end - init +1;
    }

}
