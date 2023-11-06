public class Separate {
    public static void separateNumbers(String s) {
        String substr = "";
        boolean isValid = false;
        for (int i = 1; i <= s.length() / 2; i++) {
            substr = s.substring(0, i);
            Long num = Long.parseLong(substr);
            String validStr = substr;
            while (validStr.length() < s.length()) {
                validStr += Long.toString(++num);
            }
            if (s.equals(validStr)) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + substr : "NO");
    }

    public static int anagram(String s) {
        if (s.length() % 2 != 0) return -1;

        CharSequence[] first = s.substring(0, s.length() / 2).split("");
        String second = s.substring(s.length() / 2);

        int count = s.length() / 2 ;
        for (int i = 0; i < first.length; i++) {
            if (second.contains(first[i])) {
                count--;
            }
        }
        return count;
    }
}
