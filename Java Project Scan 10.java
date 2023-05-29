package Week6;
import java.util.Arrays;
public class FridayProjectQuestion10 {

        public static void main(String[] args) {
            int[] arr1 = {1, 5, 8, 5, 74};
            int[] arr2 = {2, 1, 5};
            int[] arr3 = new int[arr1.length + arr2.length];
            int checkpoint = 0;
            for (int i = checkpoint; i < arr1.length; i++) {
                arr3[i] = arr1[i];
                checkpoint++;
            }
            for (int i = 0; i < arr2.length; i++) {
                arr3[checkpoint] = arr2[i];
                checkpoint++;
            }
            System.out.println(Arrays.toString(arr3));
        }
    }