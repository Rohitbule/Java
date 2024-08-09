public class Staticc {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.schoolName = "LWS";
        System.out.println("the first school is : " +s1.schoolName);

        Student s2 = new Student();
        System.out.println("The second school is : " +s2.schoolName);

        Student s3 = new Student();
        s3.schoolName="WHS";

        System.out.println("After s3 update:");
        System.out.println("s1 schoolName: " + s1.schoolName);  // Should print: WHS
        System.out.println("s2 schoolName: " + s2.schoolName);  // Should print: WHS

        
    }
}

class Student
{
    String Name;
    int roll;

    static int percentage(int math,int chem,int phy)  // parat parat banyachi gharaj nhi
    {
        return (math+chem+phy)/3;
    }

    static String schoolName;

    void setName(String Name)
    {
        this.Name = Name;
    }

    String getName()
    {
        return this.Name;
    }
}