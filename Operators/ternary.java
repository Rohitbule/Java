import java.util.*;
public class ternary {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        String b = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(b);
    }
}
