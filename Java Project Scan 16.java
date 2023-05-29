package Week6;
import java.util.Scanner;
public class FridayProjectQuestion16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 1000) + 1;
        int attempts = 10;
        System.out.println("Guess the number between 1 and 1000");

        while (attempts > 0) {
            int userInput = scanner.nextInt();
            if (userInput < randomNumber) {
                System.out.println("Think big buddy!");
                attempts--;
            } else if (userInput > randomNumber) {
                System.out.println("Take it easy tiger!");
            } else {
                System.out.println("You nailed it in " + (10 - attempts) + " attempts.");
            }
        }
        if (attempts == 0) {
            System.out.println("Today is not your lucky day. Try again tomorrow...");
        }
    }
}

