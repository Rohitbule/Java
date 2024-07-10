public class prefix {

    public static void subarraymax(int a[])
    {
        int currsum = 0;
        int max=Integer.MIN_VALUE;
        
        //making array
        int prefix[] = new int[a.length];
        prefix[0] = a[0];

        for(int i=1; i<prefix.length; i++)
        {
            prefix[i]= prefix[i-1] + a[i];
        }
        
        for(int i=0; i<a.length; i++)
        {
            int start = i;
            for(int j=i ; j<a.length; j++)
            {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(max < currsum )
                {
                    max = currsum;
                }
            }
        }
        System.out.println("The maximun sum of array is : " +max);
    }
    public static void main(String args[])
    {
        int a[] = {1,-2,6,-1,3};
        subarraymax(a);
    }
}
