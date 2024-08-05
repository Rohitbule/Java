public class Shallowanddeep {
    public static void main (String args[])
    {
        Student s1 = new Student();
        s1.Name="Rohit";
        s1.roll=06;
        s1.password="ABC";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password="XYZ";
        s1.marks[2] = 100; //student1 che marks change kele pan te student2 sathi change nahi zale.
        System.out.println("The Name of Student : " +s2.Name);
        System.out.println("The Roll no of Student : "+s2.roll);
        System.out.println("The password of student : "+s2.password);
        System.out.print("The array is : ");
        for(int i=0;i<3;i++)
        {
            System.out.print(+s2.marks[i]+" ");
        }
    }
}
class Student
{
    String Name;
    int roll;
    String password;
    int marks[];

    //Deep copy ahe
    // Student (Student s1)
    // {
    //     System.out.println("This is Deep copy Constructor");
    //     marks = new int[3];
    //     this.Name=s1.Name;
    //     this.roll=s1.roll;
    //     this.password=s1.password;
    //     for(int i=0; i<marks.length; i++)
    //     {
    //         this.marks[i]=s1.marks[i];
    //     }
    // }

    //Shallow copy ahe 
    Student(Student s1)
    {
        System.out.println("This is Shallow copy Constructor");
        marks = new int[3];
        this.Name=s1.Name;
        this.roll=s1.roll;
        this.password=s1.password;
        this.marks = s1.marks;
    }

    Student() 
    {
        marks = new int[3]; // Initialize the marks array
    }
}