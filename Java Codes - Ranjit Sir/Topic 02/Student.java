import java.io.*;
import java.lang.*;

class Stud 
{
    // Characteristics / Data Members / Class Variables/Fields (attributes)
    private int Phy = 0, Chem = 0, Maths = 0;
    private String Name = "";

    // Constructors
    public Stud()       // Default
    {
        this.Phy = 0;
        this.Chem = 0;
        this.Maths = 0;
        this.Name = "\0";
    }

    public Stud(int M1, int M2, int M3, String Nm)      // Parameterized
    {
        this.Phy = M1;
        this.Chem = M2;
        this.Maths = M3;
        this.Name = Nm;
    }

    // Methods (behaviors)

    public void Display_Student_Details() 
    {
        System.out.print("\n Name : " + Name);
        System.out.print("\n Marks => ");
        System.out.print("\t Physics = " + Phy + "\t Chemistry = " + Chem + "\t Mathematics = " + Maths + ".");
        System.out.print("\n Total Marks = " + (Phy+Chem+Maths));
    }

    // Getter Method for Name
    public String Getter() 
    {
        return Name;
    }

    // Setter for Name
    public void Setter(String Nm) 
    {
        this.Name = Nm;
    }

    // Additional methods can be added here
}

public class Student 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Creating an object of Stud Class
        Stud Std1 = new Stud();
        Stud Std2 = new Stud(93, 77, 85, "Harry Potter");

        // Calling methods
        System.out.println("\n\n Student 1 Details are => ");
        Std1.Display_Student_Details();
        System.out.println("\n\n Student 2 Details are => ");
        Std2.Display_Student_Details();

        br.read();
        // Using getter and setter
        Std1.Setter("Jacky Chan");
        System.out.println("\n Name Updated Student1 : " + Std1.Getter());

        br.read();
        // Using getter and setter
        System.out.println("\n Name Given Student2  : " + Std2.Getter());
        Std2.Setter("Kishan Kanheyaa");
        System.out.println("\n Name Updated Student2 : " + Std2.Getter());

        br.read();
        // Calling methods
        System.out.println("\n\n Student 1 Details are => ");
        Std1.Display_Student_Details();
        System.out.println("\n\n Student 2 Details are => ");
        Std2.Display_Student_Details();
    }
}
