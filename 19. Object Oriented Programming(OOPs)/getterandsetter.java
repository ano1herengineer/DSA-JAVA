public class getterandsetter
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();  //object creation using new keyword
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

}

class Pen 
{
    // properties and function 

    private String color;
    private int tip;

    // getters = to return the value
    String getColor()
    {
        return this.color;
        // this keyword is used to refer to the curent object 
    }

    int getTip()
    {
        return this.tip;
    }
     
    // setters = to modify the value
    void setColor(String newColor)
    {
        this.color = newColor;
    }

    void setTip(int tip)
    {
        this.tip = tip;
    }
}
