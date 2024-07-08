public class reverse {

    public static void reversearray(int a[])
    {
        int start = 0;
        int last = a.length-1;
        while(start < last)
        {
            int temp = a[last];
            a[last] = a[start];
            a[start] = temp;

            start++;
            last--;
        }
    }

    public static void main(String args[])
    {
        int a[] = {2,4,6,8,10};
        reversearray(a);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
        //System.out.println();
    }
}
