
import java.util.*;

public class AsteroidCollision {
    // First: Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

// Second: Function
class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0) {
                if (stack.peek() < Math.abs(asteroid)) {

                    stack.pop();
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
