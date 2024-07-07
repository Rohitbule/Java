import java.util.*;
public class fact{
    public static void main(String args[])
    {   
        //bincoefficient();
        //rangeofprime();
        BintoDec();
        DectoBin();
    }

    public static void bincoefficient()
    {
        int fact_n= 6;
        int fact_r= 2;
        int fact_nmr=fact_n - fact_r;
        int a = factorial(fact_n);
        int b = factorial(fact_r);
        int c = factorial(fact_nmr);
        int d = a / (b * c);
        System.out.println(d);
    }

    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    /*public static int prime(int n)
    {
        
        
        
        if(n == 2)
        {
            return 1;
        }
        else
        {
            boolean flag = true;
            for(int i=2; i<=n; i++)
            {
                if(n % i == 0)
                {
                    //break;
                    flag = false;
                }
                 
            }
            if(flag == true )
            {
                return 1;
            }  
            else
            {
                return 0;
            }
        }
        
    }*/
    
    public static boolean isprime(int n)
    {
        if(n == 2 )
         return true;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void rangeofprime()
    {
        int n = 17;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void BintoDec()
    {
        int n = 1111;
        int pow = 0;
        int dec = 0;
        while(n > 0)
        {
            int lastdigit = n%10;
            dec = dec + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            n = n / 10 ;
        }
        System.out.println(dec);
    }

    public static void DectoBin()
    {
        int n = 15;
        int pow = 0;
        int bin=0;
        while(n > 0)
        {
            int rem = n % 2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
             n = n / 2 ; 
        }
        System.out.println(bin);
    }
}