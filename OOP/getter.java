public class getter {
    public static void main(String args[])
    {
        pen p1 = new pen();
        p1.setColor("Red");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class pen{
    private String color;
    private int tip;
    void setColor(String color)
    {
        this.color = color;  // this keyword is object 
    }
    void setTip(int tip)
    {
        this.tip=tip;
    }
    String getcolor()
    {
        return this.color;
    }
    int getTip()
    {
        return this.tip;
    }
}
