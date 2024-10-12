import java.lang.*;
import java.util.*;

public class MaxElementInArray 
{
    public static void main(String[] args) 
	{
        int[] Numbers = {3, 5, 7, 2, 8, -1, 4}; // Sample array
        int MaxEle = findMax(Numbers);
		
        System.out.println("The maximum element in the array is : " + MaxEle);
    }

    public static int findMax(int[] Num) 
	{
        int Max = Num[0]; // Assume first element is the max

        for (int i = 1; i < Num.length; i++) 
		{
            if (i == 0 || Num[i] > Max) 
			{
                Max = Num[i];
            }
        }

        return Max;
    }
}
