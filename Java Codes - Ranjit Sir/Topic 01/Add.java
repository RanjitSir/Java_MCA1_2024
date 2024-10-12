import java.lang.*;
import java.util.*;

public class Add
{
  public static void main(String[] args)
  {
		int N1 = 0, N2 = 0, Sum = 0;
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter 1st Number : ");
		N1 = S.nextInt();
		System.out.print("\n Enter 2nd Number : ");
		N2 = S.nextInt();

		Sum = N1 + N2;

		System.out.println("\n Addition of " + N1 + " & " + N2 + " is = " + Sum + ".");

		System.out.println("\n Thanks.");
  }
}
