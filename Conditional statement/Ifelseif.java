import java.util.*;
public class Ifelseif {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 3;
        int c = 6;
        if(a>=b && a>=c)
        {
            System.out.println("a is largest and the value of a is : "+a);
        }
        else if(b>=c)
        {
            System.out.println("B is largest and the value of b is  :"+b);
        }
        else
        {
            System.out.println("C is largest and the value of c is :"+c);
        }


        /*System.out.print("Enter the income : ");
        int income = sc.nextInt();
        int tax;
        if( income <= 500000)
        {
            tax =0;
        }
        else if(income >= 500000 && income <= 1000000)
        {
            tax = (int)(income * 0.2);
        }
        else
        {
            tax = (int)(income * 0.3);
        }
        System.out.println("your tax is : " +tax);*/

        /*System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Adult : Drive ,Vote");
        }
        else if(age >= 13 && age <=16)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Not Adult");
        }*/
    }
    
}
