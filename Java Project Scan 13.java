package Week6;
import java.util.Scanner;
public class FridayProjectQuestion13 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int digit = n % 10;
            String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            System.out.println(str[digit]);
        }
    }

