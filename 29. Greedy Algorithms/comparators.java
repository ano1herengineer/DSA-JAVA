// Comparators in Java 

// A Comparator is a comparison function, which provide an ordering for collections of objects that don’t have a natural ordering.

// A Comparator in Java is an interface that is used to order the objects of a user-defined class.
// A comparator object is capable of comparing two objects of two different classes.

// Let’s take an example of a Function that compares obj1 and obj2:

// public int compare(Object obj1, Object obj2):

// There are two ways of implementing this sort function:
// a. We write a custom function on our own, where we define the sorting logic from scratch.
// b. We use the Comparator interface, which provides a compare() function that we can use to compare two objects.

// How to use sort?
// Comparator interface is used to order/sort the objects of a user-defined class.
// This interface is present in the java.util package and contains 2 methods:
// compare(Object obj1, Object obj2) and equals(Object element).

// Using a comparator, we can sort the elements based on data members/properties. For instance, it may be on the basis of name,age,height etc.

// Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator
// .public void sort(List list, ComparatorClass c)

// Internal working of sort() method:
// The sort() method calls the compare() method of the classes it is soring.
// To compare 2 objects, it asks "Which is greater ?"
// Compare() method returns -1, 0 or 1 depending on the comparison.
// If the first object is greater than the second, it returns 1.
// If the first object is less than the second, it returns -1.
// If the first object is equal to the second, it returns 0.

// It uses the returned value to sort the objects.



// Lambda Expressions in Java 

// A Lambda expression is a short block of code which takes in parameters and returns a value.
// Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
// They are used extensively in functional programming style code.

// Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
// The lambda expression should have the same number of parameters and the same return type as that method.

// Format:
// Comparator<ClassName> comparator = Comparator.comparing(o -> o.property);

// Example:
// Comparator<Job> comparator = Comparator.comparing(o -> o.profit);
// Collections.sort(jobs, comparator);

// The above code can be written in a shorter way as:
// Collections.sort(jobs, Comparator.comparing(o -> o.profit));

// Code to define a Customized Sorting Order:

import java.util.ArrayList;
import java.util.Collections;

public class comparators{
    public static void main(String args[])
    {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Amar", 34));
        list.add(new Person("Akbar", 42));
        list.add(new Person("Anthony", 28));

        Collections.sort(list);
        System.out.println(list);
    }

}

class Person implements Comparable<Person>
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person)
    {
        if(this.age == person.age)
            return 0;
        else if(this.age > person.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString()
    {
        return this.name + ":" + this.age;
    }
}