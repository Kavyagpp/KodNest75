
import java.util.*;

public class DecodeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(decodeString(s));
        scanner.close();
    }

    public static String decodeString(String s) {
        // Write your code here...
        Stack<String> textStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        String currentText = "";
        int currentNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');

            } else if (ch == '[') {
                textStack.push(currentText);
                countStack.push(currentNumber);

                currentText = "";
                currentNumber = 0;

            } else if (ch == ']') {
                String previousText = textStack.pop();
                int repeates = countStack.pop();

                StringBuilder expanded = new StringBuilder();
                for (int j = 0; j < repeates; j++) {
                    expanded.append(currentText);
                }
                currentText = previousText + expanded;
            } else {
                currentText = currentText + ch;
            }
        }
        return currentText;
    }
}
