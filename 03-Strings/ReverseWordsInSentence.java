
import java.util.*;

public class ReverseWordsInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = reverseWords(s);

        System.out.println(result);

        sc.close();
    }

    public static String reverseWords(String s) {

        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
