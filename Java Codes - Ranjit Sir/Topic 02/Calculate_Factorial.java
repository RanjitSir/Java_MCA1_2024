import java.lang.*;
import java.util.*;

class Factorial
{
		public int No;
		private int Fact;
		private Scanner scn = new Scanner(System.in);
		
		public Factorial()
		{			
			Fact = 1;
			
			System.out.print("\n Enter a Number : ");
			No = scn.nextInt();
			
			Find_Factorial();
		}
		
		public Factorial(int Num)
		{
			No = Num;
			Fact = 1;
			
			Find_Factorial();
		}
		
		private void Find_Factorial()
		{
			int Temp = No;

			while ( Temp > 0 )
			{
				Fact *= Temp;		// Fact = Fact * Temp;
				Temp--;
			}
		}
		
		public void Display_Factorial()
		{
			System.out.println("\n Factorial of Given Number " + No + " is = " + Fact + ".");
			System.out.print("\n Press Enter Key To Move Next Code...");
			scn.nextLine();
		}
	
}

public class Calculate_Factorial
{
    public static void main(String[] args)
    {
        Factorial Obj1 = new Factorial();
		
		Obj1.Display_Factorial();
		
		Factorial Obj2 = new Factorial(7);
		
		Obj2.Display_Factorial();
    }
}
