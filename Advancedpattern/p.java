public class p {
    public static void main(String args[])
    {
        int a =5;
        Diamond(a);
    }
    public static void Diamond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
}

}