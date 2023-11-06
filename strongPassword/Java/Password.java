import java.util.regex.Pattern;

public class Password {


    public static int minimumNumber(int n, String password) {
        int result = 0;

        Pattern lower = Pattern.compile("[a-z]");
        Pattern upper = Pattern.compile("[A-Z]");
        Pattern digits = Pattern.compile("\\d");
        Pattern weird = Pattern.compile("[!@#$%^&*()\\-\\+]");


        if (!lower.matcher(password).find())
            result++;

        if (!upper.matcher(password).find())
            result++;

        if (!digits.matcher(password).find())
            result++;

        if (!weird.matcher(password).find())
            result++;


        if (result + n >= 6) {
            return result;
        }

        return result += 6 - (result+n);

    }
}
