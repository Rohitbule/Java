public class fact {
    public static void factorial()
    {
        int n = 4;
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of " +n+ " is " +fact);
    }
    public static void main(String[] args) {
        
        factorial();
    }
}
