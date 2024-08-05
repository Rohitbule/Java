public class Inheritance {
    public static void main(String args[])
    {
        // Fish f1 = new Fish();
        // f1.eat();

        //multilevel inheritance
        // Dog d1 = new Dog();
        // d1.setColor("red");
        // d1.dg();
        // System.out.println("The color of dog is : " +d1.getcolor());
        // d1.mm();

        //HIERARCHIAL INHERITANCE
        Birds parrot = new Birds();
        parrot.setColor("Green");
        System.out.println("The color of parrrot is : " +parrot.getcolor());
        parrot.fly();
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eating is performed");
    }
    void breath()
    {
        System.out.println("Breathing is taking");
    }
    void setColor(String color) 
    {
            this.color = color;
        }
        String getcolor()
        {
            return color;
        }
}
// class Fish extends Animal
// {
//     int fins;
//     void swims()
//     {
//         System.out.println("Fish is doing swiming in water");
//     }
// }

//Mutlilevel Inheritance.
// class Mammal extends Animal
// {
//     int legs;
//     void mm()
//     {
//         System.out.println("I am Mammal");
//     }
// }
// class Dog extends Mammal
// {
//     String breed;
//     void dg()
//     {
//         System.out.println("I am Dog");
//     }
//     void setColor(String color) 
//     {
//         this.color = color;
//     }
//     String getcolor()
//     {
//         return color;
//     }
// }

//HIERARCHIAL INHERITANCE
class Mammal extends Animal
{
   void walks()
   {
    System.out.println("Mammal can walk");
   }  
}
class Fish extends Animal
{
    void swims()
    {
        System.out.println("Fish can swims");
    }
}
class Birds extends Animal
{
    void fly()
    {
        System.out.println("Birds can fly");
    }
}