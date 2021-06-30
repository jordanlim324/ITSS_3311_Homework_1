package problem_2;

import java.util.Scanner;

public class Program_2 
{
	/*
	 * Created by Jordan Lim
	 */
	public static void main(String[] args) 
	{
		System.out.println("Calculate your next mortgage payment! Type in your Annual Interest Rate and Balance and press Enter to continue:");
		Scanner textreader = new Scanner(System.in);
		float Interest;
		float annualInterestRate;
		float balance;
		// Declares interest, annual interest rate and balance, respectively
		Interest = 0;
		annualInterestRate = 0;
		balance = 0;
		annualInterestRate = textreader.nextFloat();
		balance = textreader.nextFloat();
		// Allows user to type in inputs for annual interest rate and balance
		
		if (balance <= 0 || annualInterestRate <= 0)
		{
			while (balance <= 0 || annualInterestRate <= 0)
			{
				System.out.println("One or more of your inputs may be negative, please try again.");
				annualInterestRate = textreader.nextFloat();
				balance = textreader.nextFloat();
			}
		}
		Interest = balance * (annualInterestRate / 1200);
		// Takes inputs and uses above formula to calculate interest
		System.out.print("The interest is = $");
		System.out.printf("%.2f", Interest);
		textreader.close();
	}
}
