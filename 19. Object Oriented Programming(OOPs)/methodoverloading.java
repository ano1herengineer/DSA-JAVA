public class methodoverloading
{
    public static void main(String args[])
    {
         Calculator calc = new Calculator();
         System.out.println(calc.sum(1,5));
         System.out.println(calc.sum(7.9f, 2.1f));
         System.out.println(calc.sum(6,5,4));
    }
}

class Calculator
{
    int sum(int a, int b)
    {
        return a + b;
    }

    float sum(float a, float b)
    {
        return a + b;
    }

    int sum(int a , int b, int c)
    {
        return a + b + c;
    }
}

// Compile Time Polymorphism 
//function overloading

//Method overloading is a feature in Java that allows you to define multiple methods with
// the same name in the same class. The methods must have different parameter lists, 
//which can be different in terms of the number, type, or order of the parameters.

//When you call an overloaded method, the compiler determines which version of the method 
//to call based on the arguments you pass in.