// Super keyword 

public class supkey
{
    public static void main(String args[])
    {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal
{
    String color;
    Animal()
    {
        
        System.out.println("animal constructor is called ");
    }
}

class Horse extends Animal
{
    Horse()
    {
       super.color = "brown"; //calling animal class constructor
       // setting the color of immediate parent class
       System.out.println("horse construcor is called");

    }
    
}