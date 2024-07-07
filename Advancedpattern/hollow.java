public class hollow{
    public static void main(String args[])
    {
        hole();
    }

    public static void hole()
    {
        int row=4;
        int col=5;
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                if(i==1 || j==1 || i==row || j==col)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}