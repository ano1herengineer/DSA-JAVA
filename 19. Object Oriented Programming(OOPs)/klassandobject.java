import java.util.*;
import java.io.*;

public class klassandobject
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();  //object creation using new keyword
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
       // p1.setColor("Yellow");
       p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "prashantsingh";
        myAcc.setPassword("abcdefghi");
    }
}
//public = access specifier
//void = return type 
//new keyword = space inside a memory is allocated for object p1 of class Pen.(Pen Object)

// other classes should always be defined below public class 
// to make sure that the user doesn't encounter any error

class BankAccount
{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}
class Pen 
{
    // properties and function 

    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
}

class Student
{
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math)
    {
        percentage =(phy + chem + math)/3;
    }
}