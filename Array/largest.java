public class largest {
    public static int getlargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; // -minus infinity;
        int smallest = Integer.MAX_VALUE; // +plus infinity;
        for(int i=0; i<numbers.length; i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest element is : " +smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int numbers[] = {1,2,6,3,5};
        int output = getlargest(numbers);
        System.out.println("Largest element of array is : " +output);
    }
}
