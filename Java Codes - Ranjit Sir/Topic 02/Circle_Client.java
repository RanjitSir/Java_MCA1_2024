import java.lang.*;
import java.util.*;

class Circle 
{
    private float Rad; 			// Private Characteristic or Data Member of Class Circle

    public float Area, Circum; 	// Public Characteristics or Data Members of Class Circle

    // Default Constructor
    public Circle() 
	{
        Rad = Area = Circum = 0.0f;
        System.out.println("\n Inside Default Constructor!!!");
    }

    // Parameterized Constructor
    public Circle(float R) 
	{
        Rad = R;
        Area = Circum = 0.0f;
        System.out.println("\n Inside Parameterized Constructor!!!");
    }

    // Copy Constructor
    public Circle(Circle Ref) 
	{
        this.Rad = Ref.Rad;
        this.Area = Ref.Area;
        this.Circum = Ref.Circum;
        System.out.println("\n Inside Copy Constructor!!!");
    }

    // Accept Radius Member Function
    public void Accept_Radius() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Enter Radius = ");
        this.Rad = scanner.nextFloat();
    }

    // Calculate Area_Of_Circle Member Function
    public void Area_Of_Circle() 
	{
        Area = (float) (3.14 * Rad * Rad);
        System.out.println("\n Area for given Circle Calculated by Function as => " + Area);
    }

    // Calculate Circumference_Of_Circle Member Function
    public void Circumference_Of_Circle() 
	{
        Circum = (float) (2 * 3.14 * Rad);
        System.out.println("\n Circumference for given Circle Calculated by Function as => " + this.Circum);
    }
}

public class Circle_Client 
{
    public static void main(String[] args) 
	{
        Circle Obj1 = new Circle();
        Circle Obj2 = new Circle(7.5f);

        Obj1.Accept_Radius();
        Obj1.Area_Of_Circle();
        Obj1.Circumference_Of_Circle();

        Obj2.Area_Of_Circle();
        Obj2.Circumference_Of_Circle();

        Circle Obj3 = new Circle(Obj1);
        Obj3.Accept_Radius();

        System.out.println("\n Area Of Circle for Copied Object = " + Obj3.Area);
        System.out.println("\n Circumference Of Circle for Copied Object = " + Obj3.Circum);
    }
}

