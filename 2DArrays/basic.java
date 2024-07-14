import java.util.*;
public class basic {

    public static void search(int a[][],int key)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                if(a[i][j] == key)
                {
                    System.out.println("Found at cell (" + i +"," + j + ")");
                    //return true;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int key = 5;
        int n=a.length;
        int m=a[0].length;
        System.out.print("Enter the Number : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
            //System.out.println();
        }

        //output
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        search(a,key);
    }
}
