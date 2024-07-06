import java.util.*;
public class sum {

    public static int mult(int a , int b)
    {
        int product = a*b;
        return product;
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

    public static int bincoeff(int n, int r)
    {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int d = a / (b * c) ;
        return d;
    }

    public static int BintoDec(int binnum)
    {
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;
        while(binnum > 0)
        {
            int lastdigit = binnum % 10 ;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binnum = binnum / 10 ; 
        }
        return decnum;
    }    


    public static void main(String args[]){
        /*int a = 10;
        int b = 20;
        int product = mult(a,b);
        System.out.println("The multiplication of " + a +" * " +b +" = " +product);*/

        /*int a = 3;
        int ans = factorial(a);
        System.out.println("The factorial of " + a +" is : "+ans);*/

        /*int a = 5;
        int x = 2;
        int ans = bincoeff(a ,x);
        System.out.println("The factorial of "   +ans);*/

        int a = 101;
        int output = BintoDec(a);
        System.out.println("the Binary to decimal : " +output);


    }
}
