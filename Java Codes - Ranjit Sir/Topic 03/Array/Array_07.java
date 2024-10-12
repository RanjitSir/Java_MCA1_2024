import java.lang.*;
import java.util.*;

public class Array_07
{
    public static void main(String[] args) 
	{
            int i = 0;
            int[] Num = new int[5];
            Scanner scn = new Scanner(System.in);
            
            /// Displaying Null Array
            for(i = 0; i < 5; i++)
            {
                System.out.println("\n Value of Element " + (i+1) + " = " + Num[i] + ".");
            }

            /// Accepting Array Elements from User
            for(i = 0; i < 5; i++)
            {
                System.out.print("\n Enter Value for Element " + (i+101) + " : ");
                Num[i] = scn.nextInt();
            }

            System.out.println("\n Entered Values in Array are => \n");
            /// Displaying Array With New Values
            for(i = 0; i < 5; i++)
            {
                System.out.println("\n Value of Element " + (i+1) + " = " + Num[i] + ".");
            }

            System.out.println("\n\n Thanks");
    }
}
