//Hiding all the unnecessary details showing only the implemtation parts to the user.
//1 . cannot create an instance of abstract class.
//2. can have abstract/non abstact methods.
//3.can have constructors.

public class AAbstract {
    public static void main(String args[])
    {
        Horse h1 = new Horse();  //Animal -> Horse -> Chiken hya type flow hoil .
        h1.eat();
        h1.walk();
        System.out.println("The color of horse : " +h1.color);
        

    }
}

abstract class Animal
{
    String color;
    Animal()
    {
        color = "black";
        System.out.println("Animal constructor is called..");
    }
    void eat()
    {
        System.out.println("Animal can eat");
    }

    abstract void walk(); // abstract method 

}

class Horse extends Animal
{
    Horse()  // constructor is called 
    {
        System.out.println("Horse constructor is called..");
    }
    void changecolor()
    {
        color = "white";
    }

    void walk()
    {
        System.out.println("Horse can walk on four legs");
    }
}

class Chiken extends Animal
{
    Chiken()
    {
        System.out.println("Chiken constructor is called..");
    }
    void changecolor()
    {
        color = "Red";
    }

    void walk()
    {
        System.out.println("Chiken can walk on two legs");
    }
}