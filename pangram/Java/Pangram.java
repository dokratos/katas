public class Pangram {
    public static String pangrams(String s) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        s = s.toLowerCase();
        for (String i : alphabet) {
            if (s.contains(i)) continue;
            else return "not pangram";
        }
        return "pangram";
    }
}
