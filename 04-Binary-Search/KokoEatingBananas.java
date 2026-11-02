
import java.util.Scanner;

public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = piles[0];

        // Find maximum pile
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        int ans = high;

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate total hours
            for (int pile : piles) {
                hours += (pile + (long) mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] piles = new int[n];

        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();

        System.out.println(minEatingSpeed(piles, h));

        sc.close();
    }
}
