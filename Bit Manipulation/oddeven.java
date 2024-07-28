public class oddeven {
    public static void oddoreven(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
    }
}
