import java.util.*;
public class basic {
    public static void main(String args[])
    {
        int marks[] = new int[50];
        Scanner sc =new Scanner(System.in);

        //input
        System.out.print("Enter the marks of physics : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter the marks of chemsitry : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter the marks of maths : ");
        marks[2] = sc.nextInt();

        //output
        System.out.println("Physics : " +marks[0]+ " , Chemistry : " +marks[1]+ " , Maths : " +marks[2]);

        //i want to change my marks 
        System.out.print("I want to change my marks of chemistry : ");
        marks[1] = sc.nextInt();
        System.out.println("Physics : " +marks[0]+ " , Chemistry : " +marks[1]+ " , Maths : " +marks[2]);

        //i also want to calculate my percentage
        int percentage = (marks[0] + marks[1] + marks[2] ) / 3 ;
        System.out.println("the percentage is : " +percentage);

        //i want to calculate the length of array
        System.out.println("length of array : " +marks.length); //RamKrishnaHari . JaiKrishnaHari
    }
}