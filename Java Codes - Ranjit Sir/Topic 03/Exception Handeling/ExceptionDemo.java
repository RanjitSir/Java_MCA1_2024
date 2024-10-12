import java.lang.*;
import java.util.*;

public class ExceptionDemo 
{
      public static void main(String[] args) 
      {
           try 
           {
               // Code that may throw an exception
               int result = 10 / 0; // This will throw ArithmeticException
           } 
           catch (ArithmeticException e) 
		   {
               // Handling the exception
               System.out.println("Error: " + e.getMessage());
           } 
		   finally 
		   {
               // Cleanup code (optional)
               System.out.println("Execution completed.");
           }
       }
}
