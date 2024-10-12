import java.lang.*;

public class JString
{
    public static void main(String[] args)
    {
        String str = "Hello, World!";

        // Print length of string
        System.out.println("\n Length: " + str.length());

        // Convert to uppercase and lowercase
        System.out.println("\n Uppercase: " + str.toUpperCase());
        System.out.println("\n Lowercase: " + str.toLowerCase());

        // Replace substring
        String newStr = str.replace("World", "Java");
        System.out.println("\n\n Replaced: " + newStr);

        // Check if string contains a substring
        System.out.println("\n\n Contains 'World': " + str.contains("World"));

        // Split string
        String[] parts = str.split(", ");
        for (String part : parts)
        {
            System.out.println("\n Part: " + part);
        }
    }
}
