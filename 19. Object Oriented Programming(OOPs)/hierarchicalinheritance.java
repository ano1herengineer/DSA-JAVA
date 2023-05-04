public class hierarchicalinheritance
{
    public static void main(String arsgs[])
    {
          Mammal m1 = new Mammal();
          m1.eat();
          m1.walk();
          Fish f1 = new Fish();
          f1.breathe();
          f1.swim();
          Bird b1 = new Bird();
          b1.eat();
          b1.fly();
    }
}

class Animal
{
     String color;

    void eat()
    {
        System.out.println("EATS");
    }

    void breathe()
    {
        System.out.println("BREATHES");
    }

}

class Mammal extends Animal{
    void walk()
    {
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim()
    {
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly()
    {
        System.out.println("fly");
    }
}



//Hierarchical Inheritance is a type of inheritance in which a single class serves as a superclass 
//for two or more subclasses. In other words, the subclasses have a common superclass, 
//but each subclass has its own set of properties and methods that are not shared with the 
//other subclasses.