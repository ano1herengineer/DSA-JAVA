//Lazy copy is a technique used to improve the performance of 
//deep copying large objects by delaying the actual copy operation until it is necessary.
//Instead of copying the entire object upfront, a lazy copy only creates\
//a reference to the original object and copies it when a modification is made to the copy.

//The idea behind lazy copy is to avoid creating unnecessary copies of large objects, 
//which can be expensive in terms of memory and processing time.
//Instead, a new object is created with a reference to the original object, 
//and the copy is made only when a change is made to the copy.

public class lazycopy {
    private String name;
    private int roll;
    private int marks[];

    public  Student() {
        // default constructor
    }

    // copy constructor
    public Student(Student other, boolean lazy) {
        this.name = other.name;
        this.roll = other.roll;
        if(lazy) {  //explanation for using boolean lazy 
            this.marks = other.marks;
        } else {
            this.marks = new int[other.marks.length];
            for(int i = 0; i < other.marks.length; i++) {
                this.marks[i] = other.marks[i];
            }
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


//boolean lazy 

// added a boolean parameter lazy to the copy constructor of the Student class.
// If the lazy parameter is true, then the constructor does not create a new copy of the marks array.
// Instead, it creates a reference to the original array. 
//If the lazy parameter is false, then the constructor creates a new copy of the marks array.

// This allows us to create a new Student object with a lazy copy of the marks array, 
//which saves memory and processing time. 
//The actual copy is made only when a change is made to the marks array of the copied object.