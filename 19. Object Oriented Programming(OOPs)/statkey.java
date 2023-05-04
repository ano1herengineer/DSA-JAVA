//Static keyword

public class statkey
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.schoolName = "St. Francis";

        Student s2 = new Student();
        System.out.println(s2.schoolName);   //ideally it should return null
        // but because I have used static keyword in schoolName therefore the school name is set for every object created in Student()

        Student s3 = new Student();
        s3.schoolName = "St. Mary's";
         // after this statement the schoolName for each object is changed to St. MAry's from previous name


    }
}

class Student
{
    static int returnPercentage(int math, int phy, int chem)
    {
        return(math + chem + phy)/ 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
          return this.name;
    }
}