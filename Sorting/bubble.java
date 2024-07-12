import java.util.Arrays;
import java.util.Collections;
public class bubble 
{
    public static void bublesort(Integer arr[])
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
}

    //printing an array
    public static void printarr(Integer arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer arr[] = { 5,4,1,3,2};
        bublesort(arr);
        printarr(arr);
        //Arrays.sort(arr);
        //printarr(arr);
        
        //Arrays.sort(arr,Collections.reverseOrder());
        //printarr(arr);
    }
}
