public class overload {
    //function overloading = multiple functions with same name but different parameters
    //1 = using paramters
     /*public static int sum(int a,int b)
     {
         return a + b;

     }*/

    public static int sum(int a ,int b,int c)
    {
        return a+b+c;
    }

    //2 = using data types
    public static int sum(int a ,int b)
    {
        return a + b;
    }

    public static float sum(float a,float b)
    {
        return a + b ;
    }

    public static void main(String args[])
    {
        /*int a = 5;
        int b= 10;
        int c = sum(a, b);
        System.out.println("The addition of two number : " +c);
        int d = sum(a, b, c);
        System.out.println("The addition of three number : " +d);*/

        int a = 10;
        int b = 5;
        int c = sum(a, b);
        System.out.println("The addition cf two  integer number is : " +c);
        float d =sum(a, b);
        System.out.println("The addition of floating number is :" +d);
    }
}
