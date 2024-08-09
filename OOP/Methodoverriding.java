//Parent and child classes both contain the same function with a different definition.
public class Methodoverriding {
    public static void main(String args[])
    {
        Deer d1 = new Deer();
        d1.eating();
    }
}

class Animal
{
    void eating()
    {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal{
    void eating()  //method overiding hot ahe.
    {
        System.out.println("Eat only grass");
    }
}