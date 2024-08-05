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


/*import java.util.Scanner;

public class MaxSumWithConstraint {

    public static int maxSumWithConstraint(int n, int k, int[] arr) {
        // Step 1: Initialize the max_prefix array
        int[] maxPrefix = new int[n];
        maxPrefix[0] = arr[0];

        // Step 2: Fill the max_prefix array
        for (int i = 1; i < n; i++) {
            maxPrefix[i] = Math.max(maxPrefix[i - 1], arr[i]);
        }

        // Step 3: Find the maximum sum of two elements with the constraint
        int maxSum = 0;
        for (int j = k + 1; j < n; j++) {
            maxSum = Math.max(maxSum, arr[j] + maxPrefix[j - (k + 1)]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Read the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the result
        System.out.println(maxSumWithConstraint(n, k, arr));

        scanner.close();
    }
}
*/