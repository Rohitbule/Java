public class sum {

    public static int mult(int a , int b)
    {
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int product = mult(a,b);
        System.out.println("The multiplication of " + a +" * " +b +" = " +product);
    }
}
