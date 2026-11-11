
import java.util.*;

public class EqualRowColumnPairs {

    public static int equalPairs(int[][] grid) {

        int n = grid.length;

        HashMap<String, Integer> map = new HashMap<>();

        // Store every row in HashMap
        for (int i = 0; i < n; i++) {

            StringBuilder row = new StringBuilder();

            for (int j = 0; j < n; j++) {
                row.append(grid[i][j]).append(",");
            }

            String key = row.toString();

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;

        // Compare every column with stored rows
        for (int j = 0; j < n; j++) {

            StringBuilder column = new StringBuilder();

            for (int i = 0; i < n; i++) {
                column.append(grid[i][j]).append(",");
            }

            String key = column.toString();

            count += map.getOrDefault(key, 0);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(equalPairs(grid));

        sc.close();
    }
}
