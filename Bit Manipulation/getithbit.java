public class getithbit {

    public static int getibit(int n, int i)
    {
        int bitmask = 1<<i;
        if((n & bitmask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static int setithbit(int n, int i)
    {
        int bitmask = 1<<i;
         return n|bitmask;
    }

    public static int clearithbit(int n, int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
 
    public static int updateithbit(int n, int i,int newbit) 
    {
        // if(newbit == 0)
        //     return clearithbit(n,i);
        // else
        //     return setithbit(n, i);

        n = clearithbit(n, i);
        int Bitmask = newbit<<i;
        return n | Bitmask;
    }  

    public static void main(String args[])
    {
        System.out.println(getibit(10,3 ));
        System.out.println(setithbit(10,2));
        System.out.println(clearithbit(10, 01));
        System.out.println(updateithbit(10, 2, 1));
    }
}
