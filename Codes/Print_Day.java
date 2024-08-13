import java.lang.*;
import java.util.*;

public class Print_Day 
{
    public static void main(String[] args)
    {
        int Day = 0;
        String dayString;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("\n Enter Day Number : ");
		Day = S.nextInt();
		
        switch (Day) 
		{
			case 1:
				dayString = "Monday";
				break;
				
			case 2:
				dayString = "Tuesday";
				break;

			case 3:
				dayString = "Wednesday";
				break;

			case 4:
				dayString = "Thursday";
				break;

			case 5:
				dayString = "Friday";
				break;

			case 6:
				dayString = "Saturday";
				break;

			case 7:
				dayString = "Sunday";
				break;

			default:
				dayString = "Invalid Day";
        }
		
        System.out.println(dayString);
    }
}
