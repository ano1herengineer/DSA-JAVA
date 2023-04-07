// Question 5 :Search and read about
// a.intern( ) method in String
// b.StringBuffer


// interns()

// In Java, the intern() method is used to intern a String object. 
// This means that the method returns a canonical representation of the string object.

// When a string is interned, it is stored in a special pool called the "String pool".
//  If a new string is created with the same value as an interned string, the JVM returns 
//  the existing interned string instead of creating a new one. 
//  This is done for memory optimization purposes as it reduces the number of duplicate objects in memory.

// Here's an example:

public class pq5
{
    public static void main(String args[])
    {
          String str1 = "Hello";
          String str2 = "Hello";
          String str3 = new String("Hello").intern();

          System.out.println(str1 == str2); // true
          System.out.println(str1 == str3); // true
          //otherwise it would had been false(last print statement)
    }
   
}

// In this example, str1 and str2 are both interned and therefore refer to the same object in memory. 
// str3 is created using the new keyword, but the intern() method is called on it, 
// which intern the string and returns the same object as str1 and str2. 
// Therefore, str1 == str3 returns true.

// It's important to note that interned strings are stored in the permanent generation of the heap,
//  so interned strings can increase the memory footprint of an application.
//  Therefore, it is recommended to use the intern() method only when necessary and with caution.

//String Buffer 

// StringBuffer is a class in Java that represents a mutable sequence of characters. 
// It provides an alternative to the immutable String class, allowing you to modify 
// the contents of a string without creating a new object every time.

// Here are some important features and methods of the StringBuffer class:
// StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
// The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
// The append() method is used to add characters, strings, or other objects to the end of the buffer.
// The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
// The delete() method is used to remove characters from the buffer.
// The reverse() method is used to reverse the order of the characters in the buffer.