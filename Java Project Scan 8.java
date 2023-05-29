package Week6;
import java.util.Arrays;
import java.util.Scanner;
public class FridayProjectQuestion8 {
    public static void main(String[] args8) {
        int[] arr = {1, 5, 8, 5, 74, 2, 1, 5};
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

