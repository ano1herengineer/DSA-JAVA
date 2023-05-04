public class Inter
{
    public static void main(String args[])
    {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
    }
}

interface ChessPlayer
{
    void moves(); //by default it is public,abstract
}

class Queen implements ChessPlayer
{
   public void moves()
    {
        System.out.println("Queen = up,down,left,right,diagonal(in all four directions)");
    }
}

class Rook implements ChessPlayer
{
   public void moves()
    {
        System.out.println("Rook = up,down,left,right");
    }
}

class King implements ChessPlayer
{
   public void moves()
    {
        System.out.println("King = up,down,left,right,diagonal (by 1 step)");
    }
}

//An interface in Java is a collection of abstract methods that are used to define a contract 
//for a set of behaviors that a class must implement. Unlike abstract classes, interfaces 
//cannot have concrete methods, only abstract methods and constants. 
//The class that implements an interface must provide an implementation for all of its methods.

//Interfaces are also useful for creating a hierarchy of behaviors, where a higher-level interface 
//defines a set of more general behaviors, and lower-level interfaces define more specific 
//behaviors that build upon the higher-level interface. This allows for code reusability and can 
//simplify the design of complex systems.