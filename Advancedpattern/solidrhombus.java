public class solidrhombus {
    public static void main(String args[])
    {
        sl(5);
        
    }
    public static void sl(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
