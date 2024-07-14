public class spiral {
    public static void spiralmatrix(int a[][])
    {
        int startrow=0;
        int startcolumn=0;
        int endrow=a.length-1;
        int endcolumn=a[0].length-1;
        while(startrow<=endrow && startcolumn<=endcolumn)
        {
            //top
            for(int j=startcolumn; j<=endcolumn; j++)
            {
                System.out.print(a[startrow][j] +" ");
            }

            //rightside
            for(int i=startrow+1; i<=endrow; i++)
            {
                System.out.print(a[i][endcolumn] +" ");
            }

            //bottom
            for(int j=endcolumn-1; j>=startcolumn; j--)
            {
                if(startrow == endrow)
                {
                    break;
                }
                System.out.print(a[endrow][j] +" ");
            }

            //leftside
            {
                for(int i=endrow-1; i>=startrow+1; i--)
                {
                    if(startcolumn == endcolumn)
                    {
                        break;
                    }
                    System.out.print(a[i][startcolumn] +" ");
                }
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }

    }
    public static void main(String args[])
    {
        int a[][]={ {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                  };
        System.out.print("The spiral matrix is : " );
        spiralmatrix(a);

    }
}
