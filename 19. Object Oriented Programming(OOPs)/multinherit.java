public class multinherit
{
    public static void main(String args[])
    {
           // Example usage:
         Bear bear = new Bear("Yogi");
          bear.eatPlants(); // prints "Yogi is eating plants"
          bear.eatMeat(); // prints "Yogi is eating meat"
          bear.roar(); // prints "Yogi is roaring"

    }
}

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    private String name;
    
    public Bear(String name) {
        this.name = name;
    }
    
    public void eatPlants() {
        System.out.println(name + " is eating plants");
    }
    
    public void eatMeat() {
        System.out.println(name + " is eating meat");
    }
    
    public void roar() {
        System.out.println(name + " is roaring");
    }
}

