public class Threaad 
{
    public static void main(String args[])
    {
        //Implementing thread using runnable methid
        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}

class A implements Runnable
{
    public void run()
    {
        f1();
    }
    public void f1()
    {
        for(int i=0 ; i<10 ;i++)
        {
            System.out.println("i =" +i);
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        f2();
    }
    public void f2()
    {
        for(int j=0; j<10; j++)
        {
            System.out.println("j =" +j);
        }
    }
}