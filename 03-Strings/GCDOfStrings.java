
import java.util.Scanner;

public class GCDOfStrings {

    public static String gcdOfStrings(String str1, String str2) {

        // Check whether both strings have a common pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the lengths of both strings
        int a = str1.length();
        int b = str2.length();

        // Find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Return the common pattern
        return str1.substring(0, a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(gcdOfStrings(str1, str2));

        scanner.close();
    }
}
