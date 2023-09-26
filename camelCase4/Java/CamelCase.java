public class CamelCase {
    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            List<String> tests = new ArrayList<>();
//
//            while (scanner.hasNext()) {
//                tests.add(scanner.nextLine());
//            }
//
//            scanner.close();
//
//            for (String input : tests) {
//                formatter(input);
//            }

    }

    public static void formatter(String input) {
        if (input.startsWith("S")) {
            if (input.endsWith("()")) input = input.replace("()", "");
            StringBuilder result = new StringBuilder(input.substring(4));
            for (int i = 1; i < result.length(); i++) {
                if (Character.isUpperCase(result.charAt(i))) {
                    CharSequence space = " ";
                    result.insert(i, space);
                    i++;
                }
            }
            System.out.println(result.toString().toLowerCase());
        } else {
            char method = input.charAt(2);
            String[] sentence = input.substring(4).split(" ");

            String result = "";

            for (String word : sentence) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                result += word;
            }



            switch (method) {
                case 'C':
                    System.out.println(result);
                    break;
                case 'V':
                    System.out.println(result.substring(0, 1).toLowerCase() +
                            result.substring(1));
                    break;
                case 'M':
                    System.out.println(result.substring(0, 1).toLowerCase() +
                            result.substring(1) + "()");
                    break;
                default:
                    System.out.println("hello!");
            }

        }
    }

}
