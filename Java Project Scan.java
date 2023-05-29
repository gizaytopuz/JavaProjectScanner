package Week6;
import java.util.Scanner;

public class FridayProjectQuestion1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World ");
        String strInput = sc.nextLine();
        System.out.println("“!dlroW olleH " + strInput + "' is: ");
        for(int b = strInput.length(); b > 0; --b)
        {
            System.out.println(strInput.charAt(b - 1));
        }
        sc.close();
    }
}

