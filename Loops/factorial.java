import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n= sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i <=n )
        {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}