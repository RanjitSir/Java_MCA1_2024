public class <ClassName> 
{
    // Characteristics / Data Members / Class Variables/Fields (attributes)
    private int attribute1;
    private String attribute2;

    // Constructor
    public <ClassName>(int attribute1, String attribute2) 
    {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    // Methods (behaviors)
    public void displayInfo() 
    {
        System.out.println("Attribute 1: " + attribute1);
        System.out.println("Attribute 2: " + attribute2);
    }

    // Getter Method for attribute1
    public int Getter() 
    {
        return attribute1;
    }

    // Setter for attribute1
    public void Setter(int Num) 
    {
        this.attribute1 = Num;
    }

    // Additional methods can be added here
}
