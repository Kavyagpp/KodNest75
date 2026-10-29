
import java.util.Scanner;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder builder = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }

            i++;
        }

        return builder.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(mergeAlternately(word1, word2));

        scanner.close();
    }

}
