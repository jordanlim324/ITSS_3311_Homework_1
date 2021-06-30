package problem_1;

import java.util.Scanner;

public class Program_1 
{
	/*
	 * Created by Jordan Lim
	 */
	public static void main(String[] args) 
	{
		Scanner textreader = new Scanner(System.in);
		String firstname;
		String lastname;
		int age;
		double height;
		// Declares name, age, and height (in feet (ex 5'6" = 5.6)), respectively
		System.out.println("Enter your First name, Last name, Age, and Height (in feet (ex 5 ft 6 in = 5.6)) and press the enter key to continue:");
		firstname = textreader.next();
		lastname = textreader.next();
		age = textreader.nextInt();
		height = textreader.nextDouble();
		//Allows user to type inputs based on the text from console
		System.out.println(firstname + " " /*space*/+ lastname + "	" /*tab*/+ age + "	" /*tab*/+ height);
		// Outputs the name, age and height from typed inputs
		textreader.close();
	}

}
