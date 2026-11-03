
import java.util.*;

public class TwoStringsAreClose {

    public static boolean closeStrings(String word1, String word2) {

        // Step 1: Check string lengths
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Step 2: Count character frequencies
        for (int i = 0; i < word1.length(); i++) {
            count1[word1.charAt(i) - 'a']++;
            count2[word2.charAt(i) - 'a']++;
        }

        // Step 3: Check whether both strings contain
        // the same set of characters
        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0)
                    || (count2[i] == 0 && count1[i] != 0)) {
                return false;
            }
        }

        // Step 4: Sort frequency arrays
        Arrays.sort(count1);
        Arrays.sort(count2);

        // Step 5: Compare frequencies
        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(closeStrings(word1, word2));

        scanner.close();
    }
}
