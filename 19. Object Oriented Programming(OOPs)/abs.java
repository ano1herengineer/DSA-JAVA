// Abstract Class 

public class abs
{
    public static void main(String args[])
    {
         Horse h = new Horse();
         h.eat();
         h.walk();
         System.out.println(h.color); //will give brown output

         Chicken c = new Chicken();
         c.eat();
         c.walk();

         Mustang myHorse = new Mustang();

         //Animal --> Horse --> Mustang 
         //constructors will be called in the above manner too.
         //see output 
    }
}

abstract class Animal
{
    String color;

    Animal()   //abstract class can have Constructors 
    {
        color = "brown";
        System.out.println("Animal Constructor Called");
    }
    void eat()
    {
        System.out.println("Animal eats");
    }

    abstract void walk();
     //abstract method = those method that doesn't have implementation

     //this walk property will depend on the subclass 
     //that is why this property is not defined here
     //also making it abstract makes sure that this property is needed to be included in 
     //the sub class if the superclass is Animal 
}

class Horse extends Animal{

    Horse()
    {
        System.out.println("Horse Constructor called");
    }

    void changeColor() //setter
    {
        color = "dark brown";
    }

    void walk()
    {
        System.out.println("walks on 4 legs");

    }
}

class Chicken extends Animal{

    void changeColor()
    {
        color = "yellow";
    }

    void walk()
    {
        System.out.println("walks on 2 legs");

    }
}


// A constructor not only initializes its objects, it can also initialize objects of its child class

class Mustang extends Horse{

    Mustang()
    {
        System.out.println("Mustang Constructor Called");
    }
}


//An abstract class is a class that cannot be instantiated, meaning you cannot create an object 
//of an abstract class directly. Instead, you can only create an object of a concrete subclass that
//extends the abstract class. Abstract classes are often used to define common behavior
//and properties that can be shared among multiple subclasses.


//Abstract classes are useful because they allow you to define a common behavior and properties 
//that can be shared among multiple subclasses, while still allowing each subclass to provide its 
//own implementation for certain methods. They also help in creating a hierarchy of classes 
//and make the code more modular and easier to maintain.