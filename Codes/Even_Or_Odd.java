import java.lang.*;
import java.util.*;

public class Even_Or_Odd
{
	  public static void main(String[] args)
	  {
			int No = 0;
			Scanner S = new Scanner(System.in);

			System.out.print("\n Enter a Number : ");
			No = S.nextInt();

			if(No % 2 == 0)
			{
				System.out.print("\n Number is Even");
			}
			else
			{
				System.out.print("\n Number is Odd");
			}

			System.out.println("\n Thanks.");
	  }
}
