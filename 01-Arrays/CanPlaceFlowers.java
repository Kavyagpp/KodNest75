
import java.util.*;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] flowerbed = new int[size];

        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        boolean result = canPlaceFlowers(flowerbed, n);

        System.out.println(result);

        sc.close();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;

                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
