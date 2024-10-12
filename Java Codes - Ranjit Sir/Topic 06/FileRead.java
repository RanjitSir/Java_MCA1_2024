// Reading Data from a File
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead 
{
    public static void main(String[] args) 
	{
        String filename = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
		{
            String line;
            while ((line = reader.readLine()) != null) 
			{
                System.out.println(line); // Print each line read from the file
            }
        } 
		catch (IOException e) 
		{
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
