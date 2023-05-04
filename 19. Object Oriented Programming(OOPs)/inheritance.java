import java.io.*;

public class inheritance
{
    public static void main(String args[])
    {
         Fish shark = new Fish();
         shark.eat();   //possible because of Inheritance 
         shark.breathe();   //possible because of Inheritance 
         shark.swim();

         Dog dobby = new Dog();  
         dobby.eat();            //Multilevel inheritance 
         dobby.legs = 4;
         System.out.println(dobby.legs);
    }
}


//base class
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

//Derived Class /Sub Class
class Fish extends Animal{   //extends keyword 
    int fins;

    void swim()
    {
        System.out.println("Swims in water");
    }
}




// Inheritance is a concept in object-oriented programming that allows you to create new classes
//  based on existing classes. The new class, called a subclass or derived class, inherits all the
// properties and methods of the existing class, called the superclass or base class. The subclass
//  can then add or modify its own properties and methods, or override methods from the superclass


//To create a subclass in Java, you use the extends keyword followed by the name of the superclass.

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{  //MultiLevel inheritance 
    String breed;
}