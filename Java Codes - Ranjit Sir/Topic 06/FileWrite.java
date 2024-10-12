// Writing Data to a File
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite
{
    public static void main(String[] args) 
    {
        String filename = "example.txt";
        
        // Data to be written to the file
        String[] data = {
							"Hello, World!",
							"Welcome to Java File I/O.",
							"This is a simple example.",
							"Goodbye!"
						};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
		{
            for (String line : data) 
			{
                writer.write(line);
                writer.newLine(); // Write a new line after each entry
            }
            System.out.println("Data written to the file successfully.");
        } 
		catch (IOException e) 
		{
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
