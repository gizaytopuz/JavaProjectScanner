package Week6;
import java.util.Scanner;

public class FridayProjectQuestion15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length - 1) {
                    System.out.print("****");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.print(" ");
        }

    }
}

