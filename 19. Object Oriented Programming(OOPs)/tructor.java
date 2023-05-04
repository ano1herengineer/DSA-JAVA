public class tructor
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Prashant");
        System.out.println(s2.name);
        Student s3 = new Student(123);

        // here as different constructors are called with the same name 
        // this phenomenon is called Constructor Overloading
        // and this is an example of Polymorphism 
    }
}

class Student{
    String name;
    int roll;

    Student()
    {
        System.out.println("Non-Parametrized Constructor");
    }

    Student(String name) // Parametrized Constructor 
    {
        this.name = name;
        System.out.println("Parametrized Constructor is called and name is initialized");

    }

    Student(int roll)
    {
        this.roll= roll;
        System.out.println("roll number initialized");
    }
}