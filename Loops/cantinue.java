import java.util.*;
public class cantinue {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            if( n%10 == 0)
            {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
