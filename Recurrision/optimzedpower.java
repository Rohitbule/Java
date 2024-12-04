public class optimzedpower {

    public static void main(String args[]){
        int a = 2;
        int n= 5;
        System.out.println("the power of " +a+ " is " +opower(a,n));  //o(logn)
    }
    
    public static int opower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower = opower(a,n/2);
        int halfpower2 = halfpower * halfpower;

        //n is odd
        if(n%2!=0){
            halfpower2 = a*halfpower2;
        }
        return halfpower2;
    }
    
}
