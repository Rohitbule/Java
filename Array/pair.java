public class pair{

    public static void pairarray(int a[])
    {
        int pair = 0 ;
        for(int i=0; i<a.length; i++)
        {
            int count = a[i];
            for(int j=i+1; j<a.length; j++)
            {
                System.out.print("(" +count+ "," +a[j]+ ")");
                pair++;
            }
            System.out.println();
        }
        System.out.print("The total pair are : " +pair);
    }
    public static void main(String args[])
    {
        int a[] = {2,4,6,8,10,12,14};
        pairarray(a);

    }
}