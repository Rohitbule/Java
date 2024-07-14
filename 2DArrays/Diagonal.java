import java.util.Scanner;

public class Diagonal 
{
    public static void diagonalmatrix(int a[][])
    {
        int sum =0;
        // for(int i=0; i<a.length; i++)
        // {
        //     for(int j=0; j<a[0].length; j++)
        //     {
        //         if( i == j)
        //         {
        //             sum += a[i][j];
        //         }
        //         if(i+j == a.length-1)
        //         {
        //             sum += a[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<a.length; i++)
        {
            sum += a[i][i];
            if(i != a.length-1-i)
            sum += a[i][a.length-i-1];
        }
        System.out.println("The addition of diagonal matrix is : " +sum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];

        System.out.print("Enter the Number : ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        diagonalmatrix(a);
    }  
}
