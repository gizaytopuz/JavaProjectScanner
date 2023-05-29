package Week6;
import java.util.Scanner;
public class FridayProjectQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        boolean palindrome = false;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);

    }
}

