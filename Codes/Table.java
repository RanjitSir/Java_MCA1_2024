import java.lang.*;
import java.util.*;

public class Table 
{
    public static void main(String[] args)
    {
        int No = 0, i = 0;
        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter a Number : ");
        No = S.nextInt();

        i = 1;

        while( i <= 10 )
        {
            System.out.println(" " + No + " * " + i + " = " + No * i);
            i++;
        }

        System.out.println("\n No = " + No + "\n i = " + i);
    }
}
