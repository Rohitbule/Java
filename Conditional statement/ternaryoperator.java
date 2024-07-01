import java.util.*;
public class ternaryoperator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        String b = ((a %2) == 0) ? "even": "Odd";
        System.out.println(b);
    }
}
