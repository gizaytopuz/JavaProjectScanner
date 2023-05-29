package Week6;

public class FridayProjectQuestion12 {
    public static void main(String[] args) {
        int[] arr = {15, 45, 158, 25, 74, 1200, 555, 2910, 120};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100 && arr[i] <= 999) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

