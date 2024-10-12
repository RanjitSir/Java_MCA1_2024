import java.lang.*;

public class Array
{
    public static void main(String[] args)
    {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array length
        System.out.println("\n Array length: " + numbers.length + "\n");

        // Access and print each element
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("\t Element at index " + i + ": " + numbers[i]);
        }
    }
}
