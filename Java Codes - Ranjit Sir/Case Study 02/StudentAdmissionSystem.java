import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
	private int Roll_No;
    private String Name;
    private int Phy, Chem, Maths, Tot;
	private float Per;
    private String Course;

    public Student(int RNo, String Nm, int P, int C, int M, String Crs) 
	{
		this.Roll_No = RNo;
        this.Name = Nm;
        this.Phy = P;
		this.Chem = C;
        this.Maths = M;
		this.Course = Crs;
		
		this.Calulate();
    }

	private void Calulate()
	{
		this.Tot = this.Phy + this.Chem + this.Maths;
		this.Per = ((float)this.Tot)/ 3;
	}
	
    @Override
    public String toString() 
	{
        return "\n Roll Number : " + Roll_No + "\n Student Name : " + Name + ". \n Marks => Physics = " + Phy + ", Chemistry = " + Chem + ", Mathematics = " + Maths + ". \n\n Total Marks = " + Tot + ".\n Percentage = " + Per + ".\n Course : " + Course + ".\n====######====\n";
    }
}


public class StudentAdmissionSystem 
{
	private static int RNo = 101;
    private ArrayList<Student> StudentsList;
    private Scanner scanner;

    public StudentAdmissionSystem() 
	{
        StudentsList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void AddNewStudent() 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\n Enter Student Details for Roll Number : " + RNo);
        System.out.print("\n\n Enter Student Name : ");
        String SName = scanner.nextLine();
		
        System.out.print("\n Enter Student Marks : ");
		System.out.print("\n Physics : ");
        int P = Integer.parseInt(scanner.nextLine());
		System.out.print("\n Chemistry : ");
        int C = Integer.parseInt(scanner.nextLine());
		System.out.print("\n Mathematics : ");
        int M = Integer.parseInt(scanner.nextLine());
		
        System.out.print("\n Enter Course Name : ");
        String CourseNm = scanner.nextLine();

        Student NewStud = new Student(RNo, SName, P, C, M, CourseNm);
        StudentsList.add(NewStud);
        System.out.println("\n Student Details Added Successfully!\n-------------------------------------\n");
		RNo++;
		
		System.out.print("\n Press Enter Key To Go To Main Menu ...");
		scn.nextLine();
    }

    public void DisplayAllStudents()
	{
		Scanner scn = new Scanner(System.in);

        if (StudentsList.isEmpty()) 
		{
            System.out.println("\n No Student Added Yet.");
        } 
		else 
		{
            System.out.println("\n\n List of Students => \n");
            for (Student Std : StudentsList) 
			{
                System.out.println(Std);
            }
        }
        System.out.print("\n Press Enter Key To Go To Main Menu ...");
		scn.nextLine();
    }

    public void menu() 
	{
        while (true) 
		{
            System.out.println("\n **_** Student Admission System **_**\n");
            
			System.out.println(" Choices => \n");
			System.out.println(" 1. Add New Student");
            System.out.println(" 2. Display Students List");
            System.out.println(" 3. Exit");
            System.out.print("\n Enter Choice : ");

            int choice = Integer.parseInt(scanner.nextLine());
			
            switch (choice) 
			{
                case 1:
                    AddNewStudent();
                    break;
                case 2:
                    DisplayAllStudents();
                    break;
                case 3:
                    System.out.println("\n Exiting the system.<*Thanks*>\n");
                    return;
                default:
                    System.out.println("\n Invalid option, please try again.\n");
            }
        }
    }

    public static void main(String[] args) 
	{
        StudentAdmissionSystem system = new StudentAdmissionSystem();
        system.menu();
    }
}
