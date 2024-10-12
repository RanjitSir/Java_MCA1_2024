// Java Program to Illustrate BufferedReader Class
// Importing required class

import java.io.*;

// Main class
class RBufferedReader
{
	// Main driver method
	public static void main(String args[])throws IOException
	{
		// Creating object of class inside main() method
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\n Enter an integer : ");

		// Taking integer input
		int a = Integer.parseInt(br.readLine());

		System.out.print("\n Enter a String : ");

		String b = br.readLine();

		// Printing input entities above
		System.out.print("\n You have entered :- " + a	+ " and name as " + b);
	}
}
