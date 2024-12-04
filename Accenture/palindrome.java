import java.util.*;
import java.util.stream.Stream;
public class palindrome 
{
    public static boolean isp(String name)
    {
        for(int i=0; i<name.length()/2; i++)
        {
            int n =name.length();
            if(name.charAt(i) != name.charAt(n-i-1))
            {
                return  false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(isp(name));
    }    
}
