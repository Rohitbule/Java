public class Subarray {

    public static void printsubarray(int a[])
    {
        int c =0;
        for(int i=0; i<a.length; i++)
        {
            int start = i;
            for(int j=i; j<a.length; j++)
            {
                int end = j;
                {
                    for(int k=start; k<=end; k++)
                    {
                        System.out.print(a[k]+" ");
                    }
                    c++;
                }
                System.out.println();
                
            }
            
        }
        System.out.println("The total count is :" +c);
    }

    public static void main(String args[])
    {
        int a[] = { 2,4,6,8,10};
        printsubarray(a);
    }
}
