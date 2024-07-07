public class avg {

    public static void av()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = (a + b + c ) / 3;
        System.out.println("The avergae of three number is : " +d );
    }

    public static boolean iseven(int n)
    {
        int a = n;
        if(a%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void palindrome()
    {
        int n = 321;
        int a = 0;
        //int pow =0;
        while(n>0)
        {
            int lastdigit = n % 10;
            a =  lastdigit + ( a * 10);
            //pow++;
            n = n / 10 ;
        }
        System.out.println(a);
    }
    public static void main(String args[])
    {
        //av();
        // int a = 10;
        // boolean b =iseven(a);
        // System.out.println("The Number " +a+ " is " +b);
        palindrome();
        
    }
}
