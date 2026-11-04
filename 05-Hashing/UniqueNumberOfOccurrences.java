
import java.util.*;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Store frequencies in a HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int count : map.values()) {

            // If frequency already exists, return false
            if (set.contains(count)) {
                return false;
            }

            set.add(count);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(uniqueOccurrences(arr));

        scanner.close();
    }
}
