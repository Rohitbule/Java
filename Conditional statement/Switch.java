
import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+' : System.out.println("The addition is :"  + (a+b));
                        break;
            case '-' : System.out.println("The subtraction is :" + (a-b));
                        break;
            case '*' : System.out.println("The Multiplication is :"  + (a*b));
                        break; 
            case '/' : System.out.println("The division is :"  + (a/b));
                        break;
            case '%' : System.out.println("The moduluos is :"  + (a%b));
                        break;
            default : System.out.println("invalid number");         
        }


        /*int number = 2;
        switch(number) {
            case 1 : System.out.println("Somasa");
                    break;
            case 2 : System.out.println("Burger");
                    break;
            case 3 : System.out.println("Mango shake");
                    break;
            default : System.out.println("Wake up form dream");
        }*/
    }
    
}
