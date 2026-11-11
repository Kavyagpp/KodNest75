
import java.util.*;

public class RemovingStarsFromString {

    public static String removeStars(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '*') {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(removeStars(s));

        scanner.close();
    }
}
