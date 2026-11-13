
import java.util.*;

public class PairsOfSpells {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int n = potions.length;
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int left = 0;
            int right = n - 1;
            int index = n;

            while (left <= right) {

                int mid = left + (right - left) / 2;
                long product = (long) spells[i] * potions[mid];

                if (product >= success) {
                    index = mid;
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
            result[i] = n - index;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] spells = new int[n];

        for (int i = 0; i < n; i++) {
            spells[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] potions = new int[m];

        for (int i = 0; i < m; i++) {
            potions[i] = sc.nextInt();
        }

        long success = sc.nextLong();
        int[] answer = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(answer));

        sc.close();
    }
}
