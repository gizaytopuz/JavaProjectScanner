package Week6;
import java.util.Scanner;

public class FridayProjectQuestion17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(arr[((n % 1000) - (n % 100)) / 100]);
    }
}

