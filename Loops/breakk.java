import java.util.*;
public class breakk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the Number : ");
            int a = sc.nextInt();
            if( a % 10 == 0)
            {
                break;
            }
            System.out.println(a);
        }while(true);
        System.out.println("you hit ht number which is multiple of 10");
        
        
        /*for ( int i=1; i<=5; i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out loop");*/
    }
    
}
