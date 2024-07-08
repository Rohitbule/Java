public class functionarray {

    public static void update(int marks[], int nonchangeable)
    {
        int a = 10;
        for(int i=0; i<marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[])
    {
        int marks[] = { 97,98,99};
        int nonchangeable = 5;
        update(marks, nonchangeable);

        //print
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        
        
        System.out.println(nonchangeable);
        
    }

}
