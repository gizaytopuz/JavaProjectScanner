package Week6;

public class FridayProjectQuestion5 {

    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n = 34879;

        // Function call
        System.out.println(getSum(n));
    }
}

