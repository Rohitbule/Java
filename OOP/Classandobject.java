public class Classandobject {
    public static void main(String args[])
    {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(5);
        //p1.color = "yellow";
        p1.color="yellow";
        System.out.println(p1.color);
    }   
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
}
