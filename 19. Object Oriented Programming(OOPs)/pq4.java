//what is the output of thw following program

abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class pq4 extends Car {
    public pq4() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String gears[]) {
        new pq4();
    }
}

// A. 23451
// B. 12354
// C. 13245
// D. The code does not compile

//Output = 1325