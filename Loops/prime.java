import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        if(n == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            boolean b = true;
            for(int i =2; i<=Math.sqrt(n); i++) 
            {
                if(n % i == 0)
                {
                    b=false;
                }
            }
            if(b == true)
            {
                System.out.println("Number is prime");
            }
            else
            {
                    System.out.println("Number is not prime");
            }
        }        
    }
}