public class constructor{
    public static void main(String args[])
    {
        // Student s1 = new Student("Rohit");
        // System.out.println(s1.Name);
        // Student s2 = new Student(123);
        // System.out.println(s2.roll);

        //Student s1 = new Student();  

        //Student s2 = new Student("Rohit");
        //System.out.println(s2.Name);

        //Student s3 = new Student("rohit",123); //when we passing an two argument we have print statemnet two times.
        //System.out.println(s3.Name);
        //System.out.println(s3.roll);

        Student s1 = new Student();
        s1.Name="Rohit";
        s1.roll=06;
        s1.password="ABC";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password="XYZ";
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    
    }
}
class Student
{
    String Name;
    int roll;
    String password;
    int marks[];

    Student(Student s1)
    {
        System.out.println("This is Shallow copy Constructor");
        this.Name=s1.Name;
        this.roll=s1.roll;
        this.password=s1.password;
        this.marks = s1.marks;
    }
    //Non-parametrized Constructor
    Student()
    {
        System.out.println("This is an non parametrized constructor");
    }
    //Parametrized Constructor
    Student(String Name)
    {
        System.out.print("This is an parametrized constructor with input one : ");
        this.Name = Name;
    }
    //Parametrized Constructor
    Student(String Name , int roll)
    {
        System.out.println("This is parametrized constructor with two input");
        this.Name=Name;
        this.roll=roll;
    }
}