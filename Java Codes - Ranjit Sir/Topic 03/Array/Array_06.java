import java.lang.*;

public class Array_06
{
    public static void main(String[] args) 
	{
            int[] Num = new int[5];

            /// Displaying Null Array
            System.out.println("\n Value of Element 1 = " + Num[0] + ".");
            System.out.println("\n Value of Element 2 = " + Num[1] + ".");
            System.out.println("\n Value of Element 3 = " + Num[2] + ".");
            System.out.println("\n Value of Element 4 = " + Num[3] + ".");
            System.out.println("\n Value of Element 5 = " + Num[4] + ".");

            /// Initializing Array Elements
            Num[0] = 10;
            Num[1] = 20;
            Num[3] = 77;
            Num[4] = 21;

            System.out.println("\n Changed Values in Array are => \n");
            /// Displaying Array With New Values
            System.out.println("\n Value of Element 1 = " + Num[0] + ".");
            System.out.println("\n Value of Element 2 = " + Num[1] + ".");
            System.out.println("\n Value of Element 3 = " + Num[2] + ".");
            System.out.println("\n Value of Element 4 = " + Num[3] + ".");
            System.out.println("\n Value of Element 5 = " + Num[4] + ".");

            System.out.println("\n\n Thanks");
    }
}
