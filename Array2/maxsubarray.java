public class maxsubarray {

    public static void subarraymax(int a[])
    {
        int sum = 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            int start = i;
            for(int j=i ; j<a.length; j++)
            {
                int end = j;
                sum=0;
                for(int k=start; k<=end; k++)
                {
                    sum += a[k];
                }
                System.out.println(sum);
                if(max < sum )
                {
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("The maximun sum of array is : " +max);
    }
    public static void main(String args[])
    {
        int a[] = {2,4,6,8,10};
        subarraymax(a);
    }
}
