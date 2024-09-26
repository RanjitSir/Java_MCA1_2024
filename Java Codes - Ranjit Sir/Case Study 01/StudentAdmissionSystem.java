import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) 
	{
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() 
	{
        return name;
    }

    public int getAge() 
	{
        return age;
    }

    public String getCourse() 
	{
        return course;
    }

    @Override
    public String toString() 
	{
        return "\n Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}


public class StudentAdmissionSystem 
{
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentAdmissionSystem() 
	{
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() 
	{
        System.out.print("\n Enter Student Name : ");
        String name = scanner.nextLine();
        System.out.print(" Enter Student Age : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print(" Enter Course Name : ");
        String course = scanner.nextLine();

        Student student = new Student(name, age, course);
        students.add(student);
        System.out.println("\n Student Details Added Successfully!\n-------------------------------------\n");
    }

    public void displayStudents() 
	{
        if (students.isEmpty()) 
		{
            System.out.println("\n No Student Added Yet.");
        } 
		else 
		{
            System.out.println("\n List of Students => \n");
            for (Student student : students) 
			{
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public void menu() 
	{
        while (true) 
		{
            System.out.println("\n **_** Student Admission System **_**\n");
            
			System.out.println(" Choices => \n");
			System.out.println(" 1. Add Student");
            System.out.println(" 2. Display Students");
            System.out.println(" 3. Exit");
            System.out.print("\n Enter Choice : ");

            int choice = Integer.parseInt(scanner.nextLine());
			
            switch (choice) 
			{
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
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
