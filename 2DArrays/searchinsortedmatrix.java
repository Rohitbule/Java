public class searchinsortedmatrix {

    public static boolean searchinsortedmat(int a[][],int key)
    {
        int row=0;
        int cols=a[0].length-1;
        while(row <=a.length && cols>=0)
        {
            if(a[row][cols] == key)
            {
                System.out.println("Found at key (" +row+ "," +cols+ ")");
                return true;
            }
            else if(key <a[row][cols])
            {
                cols--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
    public static void main(String args[])
    {
        int a[][] = { {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key =33;

        searchinsortedmat(a,key);
    }
}
