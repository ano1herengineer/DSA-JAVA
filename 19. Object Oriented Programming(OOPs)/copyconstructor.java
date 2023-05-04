import java.io.*;
import java.lang.*;

public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Prashant";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // default constructor
    Student() {
        this.marks = new int[3];
    }

    // copy constructor
    //properties of s1 copied to s2
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        //this.marks = s1.marks = will result in different function =shallow copy= refrences copied 
        this.marks = new int[3];
        for(int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];  //deep copy = changes won't reflect 
        }
    }
}


// In Java, a copy constructor is a special type of constructor that is used to create a new object as a copy of an existing object.
// It is used to create a deep copy of an object, which means that all the member variables of the object are also copied to the new object.

// A copy constructor has the same name as the class and takes a single argument of the same type as the class.
// It creates a new object and initializes its member variables with the values of the member variables of the original object.