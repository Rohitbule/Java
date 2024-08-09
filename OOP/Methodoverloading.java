public class Methodoverloading {
    public static void main(String args[])
    {
        calculator cal  = new calculator();
        System.out.println("calculator first : " +cal.sum(2,1) );
        System.out.println("Calculator second is :" +cal.sum((float)1.5,(float)2.5,(float)3.5) );
        System.out.println("calculator third is : " +cal.sum(1,2,3));
    }
    
}
class calculator
{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a,float b, float c)
    {
        return a+b+c;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}