
public class deepandshallowcopy{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setRoll(123);
        s1.setMarks(new int[]{90, 80, 70});

        // shallow copy
        Student s2 = s1;
        s2.setName("Mike");
        s2.getMarks()[0] = 100;

        System.out.println("Shallow copy:");
        System.out.println("s1: " + s1.getName() + ", " + s1.getMarks()[0]); // outputs "Mike, 100"
        System.out.println("s2: " + s2.getName() + ", " + s2.getMarks()[0]); // outputs "Mike, 100"

        // deep copy
        Student s3 = new Student(s1);
        s3.setName("Tom");
        s3.getMarks()[1] = 95;

        System.out.println("Deep copy:");
        System.out.println("s1: " + s1.getName() + ", " + s1.getMarks()[1]); // outputs "80"
        System.out.println("s3: " + s3.getName() + ", " + s3.getMarks()[1]); // outputs "95"
    }
}


 class Student {
    private String name;
    private int roll;
    private int marks[];

    public Student() {
        // default constructor
    }

    // copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = new int[other.marks.length];
        for(int i = 0; i < other.marks.length; i++) {
            this.marks[i] = other.marks[i];
        }
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}


// A shallow copy creates a new object with the same memory address as the original object.
// This means that both the original object and the copied object share the same memory.
// If you modify the data in one of the objects, the other object will be affected.

// A deep copy creates a new object with a new memory address.
// This means that the original object and the copied object have separate memory.
// If you modify the data in one of the objects, the other object will not be affected.

//If you want to modify the copied object independently of the original object, 
//you should use a deep copy. 
//If you want to modify the copied object and have those 
//changes reflected in the original object, you should use a shallow copy.