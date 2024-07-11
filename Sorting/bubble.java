public class bubble {

    public static void bublesort(int a[])
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        } 
    }

    public static void printarr(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String args[])
    {
        int a[] = { 5,4,1,3,2};
        bublesort(a);
        printarr(a);
    }
}
