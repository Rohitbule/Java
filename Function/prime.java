import java.util.*;
public class prime {
    public static void main(String args[]){

        int a = 7;
        boolean b = isprime(a);
        System.out.println("Number is prime : " +b);
    }    

    public static boolean isprime(int n)
    {
        boolean flag = true;
        if(n == 2)
        {
            return true; 
        }
        for(int i=2; i<n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
