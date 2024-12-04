public class fibno {
    public static int f(int a)
    {
        if(a==0||a==1){
            return a;
        }
        int f1=f(a-1);
        int f2=f(a-2);
        return f1 + f2;
    }
    public static void main(String args[])
    {
        int a = 5;
        System.out.println(f(5));
    }
}
