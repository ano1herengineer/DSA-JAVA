public class functionsyntax
{
    public static void main(String args[]) // this is a main function 
    {
          printHelloworld();  // function  call 
    }
    public static void printHelloworld()  // this is a user defined function 
    { //this function will print Hello World 10 Times
        for(int i =0 ; i<=9; i++)
        {
            System.out.println("Hello World");
        }
        return; //mostly written for functions that have a written type
    }
}