import java.lang.*;
import java.util.*;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits = new ArrayList<>();
	
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
	
		System.out.println("Fruits in the ArrayList:");
		
		for (String fruit : fruits) 
		{
			System.out.println(fruit);
		}
	
		fruits.remove("banana");
		
		System.out.println("Fruits after removing banana:");
		
		for (String fruit : fruits) 
		{
			System.out.println(fruit);
		}
	}
}