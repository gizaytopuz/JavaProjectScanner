package Week6;
import java.util.Arrays;
public class FridayProjectQuestion11 {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "coconut", "peanut"};
        String[] revArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}

