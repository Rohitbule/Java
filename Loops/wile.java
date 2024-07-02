import java.util.*;
public class wile{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        int i=0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Natural Number is : "+sum);
        






        /*int counter = 0;
        while(counter < 100)
        {
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("Hello world printed 100 times");*/
    }
}
