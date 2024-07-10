public class kadanes{

    public static void kadane(int a[])
    {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            currsum = currsum + a[i];
            if(currsum < 0)
            {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);

        }
        System.out.println("The maximum sum of array is : " +maxsum);
        System.out.println("The time complexity of KADADNE ALGORITHMN is : o(n)");
    }
    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(a);
    }
}