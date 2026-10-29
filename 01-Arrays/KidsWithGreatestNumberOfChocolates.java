
import java.util.*;

public class KidsWithGreatestNumberOfChocolates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        int extraChocolates = scanner.nextInt();
        boolean[] res = kidsWithGreatestChocolates(chocolates, extraChocolates);
        System.out.println(Arrays.toString(res));

    }

    public static boolean[] kidsWithGreatestChocolates(int[] chocolates, int extraChocolates) {
        // Write your code here...
        int max = chocolates[0];

        for (int i = 1; i < chocolates.length; i++) {
            if (chocolates[i] > max) {
                max = chocolates[i];
            }
        }

        boolean res[] = new boolean[chocolates.length];
        for (int i = 0; i < chocolates.length; i++) {
            res[i] = (chocolates[i] + extraChocolates) >= max;
        }
        return res;
    }
}
