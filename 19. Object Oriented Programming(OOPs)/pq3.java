//B. public and protected both can be used.
//You can provide only a less restrictive or same-access modifier when overriding a method

//look at the folowing code and choose the right option for the word

//Shape.java 

class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

//pq3.java 
public class pq3 extends Shape { 
    protected void display() {
        System.out.println("Display-derived");
    }

    public static void main(String[] args) {
        // Your code goes here
        pq3 circle = new pq3();
        circle.display();
    }
}
