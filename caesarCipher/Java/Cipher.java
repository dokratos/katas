public class Cipher {
    public static String caesarCipher(String s, int k) {
        if (k / 26 > 0) k = k % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String upper = alphabet.toUpperCase();
        String encoded = alphabet.substring(k, 26) + alphabet.substring(0, k);
        String encodedUpper = encoded.toUpperCase();

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (alphabet.indexOf(s.charAt(i)) != -1) {
                result.append(encoded.charAt(alphabet.indexOf(s.charAt(i))));
            } else if (upper.indexOf(s.charAt(i)) != -1) {
                result.append(encodedUpper.charAt(upper.indexOf(s.charAt(i))));
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
