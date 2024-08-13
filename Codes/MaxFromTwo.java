import java.lang.*;
import java.util.*;

public class MaxFromTwo 
{
  public static void main(String[] args) 
  {
		int N1 = 0, N2 = 0;
		Scanner S = new Scanner(System.in);
		
		System.out.print("\n Enter 1st Number : ");
		N1 = S.nextInt();
		System.out.print("\n Enter 2nd Number : ");
		N2 = S.nextInt();
		
		if(N1 == N2)
		{
			System.out.println("\n Both Numbers are Equal.");
		}
		else if(N1 > N2)
		{
			System.out.println("\n Number " + N1 + " is Maximum.");
		}
		else
		{
			System.out.println("\n Number " + N2 + " is Maximum.");
		}
		
		System.out.println("\n Thanks.");
  }
}

