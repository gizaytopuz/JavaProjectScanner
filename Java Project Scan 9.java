package Week6;
import java.util.Arrays;

public class FridayProjectQuestion9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, -2, 8, 5, 74};

        arr = arrayAscending(arr);
        System.out.println(Arrays.toString(arr));

        arr = arrayDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayDescending(int array[]) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] arrayAscending(int array[]) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

