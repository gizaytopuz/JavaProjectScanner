package Week6;
import static java.lang.String.valueOf;

import java.awt.*;
import java.util.Scanner;
public class FridayProjectQuestion6 {
    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 3598986;

        // Function call
        System.out.println(getSum(n));
    }
}



