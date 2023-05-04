// Print the sum, differnce and product of two complex numbers by creating a 
// a class names "Complex" with seprate methods for each operation whose real and imaginary
//parts are entered by the user.


import java.io.*;

public class pq1 {
    public static void main(String args[]) {
        // Create two Complex objects with real and imaginary values
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        // Call the add, diff, and product methods of the Complex class to perform operations on the two Complex objects
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        // Call the printComplex method of each resulting Complex object to print the results to the console
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex {
    int real;
    int imag;

    // Constructor for the Complex class
    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two Complex objects
    public static Complex add(Complex a, Complex b) {
        // Create a new Complex object with the sum of the real and imaginary parts of the input Complex objects
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    // Method to subtract one Complex object from another
    public static Complex diff(Complex a, Complex b) {
        // Create a new Complex object with the difference of the real and imaginary parts of the input Complex objects
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    // Method to multiply two Complex objects
    public static Complex product(Complex a, Complex b) {
        // Create a new Complex object with the product of the input Complex objects
        int r = (a.real * b.real) - (a.imag * b.imag);
        int i = (a.real * b.imag) + (a.imag * b.real);
        return new Complex(r, i);
    }

    // Method to print a Complex object to the console
    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}
