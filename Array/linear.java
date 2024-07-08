import java.util.*;
public class linear {

    public static int linearsearch(int number[] ,int key )
    {
        for(int i=0; i<number.length; i++)
        {
            if(number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int number[] = {2,4,6,8,10,12,14};
        int key = 2;
        int index = linearsearch(number ,key);
        if(index == -1)
        {
            System.out.println("Not index position");
        }
        else
        {
            System.out.println("The index position is : " +index);
        }
    }
}
