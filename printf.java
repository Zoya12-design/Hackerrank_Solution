import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String language = sc.next();
            int score = sc.nextInt();
            // Print the string left-
            System.out.printf("%-15s%03d%n", language, score);
        }

        System.out.println("================================");
    }
}
