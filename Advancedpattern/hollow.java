public class hollow{
    public static void main(String args[])
    {
        // hole();
        // InvertedHalfPyramid();
        // InvertedHalfPyramidwithnumber();
        // Floyd();
        // zero_one(4);
        //hollowrohombus(5);
        diamond(5);
    }

    //Diamond pattern
    public static void diamond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1 ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1 ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    //Hollow rhombus
    public static void hollowrohombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //zero_one triangle
    public static void zero_one(int n)
    {
        System.out.println("zero_one triangle");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    //Floyd's trinagle
    public static void Floyd()
    {
        System.out.println("Floyd trinagle");
        int a = 1;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    //Inverted half pyramiid with Number
    public static void InvertedHalfPyramidwithnumber()
    {
        System.out.println("InvertedHalfpyramidwithNumber");
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=4-i+1; j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    //Inverted half pyramid
    public static void InvertedHalfPyramid()
    {
        System.out.println("Inverted half pyramid");
        int row = 4;
        int col = 4;
        for(int i =1; i<=4; i++)
        {
            //space print
            for(int j=1; j<=4-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    //Hollow rectangle
    public static void hole()
    {
        System.out.println("Hollow Triangle ");
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