public class methodoverriding
{
    public static void main(String args[])
    {
          Deer d = new Deer();
          d.eat();
    }

}

class Animal{
    void eat()
    {
        System.out.println("eat anything");
    }
}

class Deer extends Animal{
    void eat()
    {
        System.out.println("eats grass");
    }
}


// Method overriding is a feature in Java that allows a subclass to provide its own implementation
// of a method that is already defined in its superclass. The method in the subclass must have 
//the same name, return type, and parameters as the method in the superclass,
// but it can provide its own implementation of the method.



//another example = 

// class Animal {
//     public void speak() {
//         System.out.println("Animal speaks");
//     }
// }

// class Dog extends Animal {
//     public void speak() {
//         System.out.println("Dog barks");
//     }
// }

// Animal animal = new Animal();
// animal.speak(); // prints "Animal speaks"

// Dog dog = new Dog();
// dog.speak(); // prints "Dog barks"

// Animal animal2 = new Dog();
// animal2.speak(); // prints "Dog barks"


//When you call an overridden method on an object of the subclass,
// the version of the method in the subclass is called instead of the version in the superclass

//It's also important to follow the principle of least surprise, 
//which means that the behavior of an overridden method should be consistent with 
//the behavior of the same method in the superclass,
// unless there's a good reason to do otherwise.