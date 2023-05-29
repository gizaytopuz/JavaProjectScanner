package Week6;
import java.util.Scanner;

public class FridayProjectQuestion14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 10 + " " + ((n % 100) - n % 10) / 10);
        if (n % 10 == ((n % 100) - n % 10) / 10) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}

