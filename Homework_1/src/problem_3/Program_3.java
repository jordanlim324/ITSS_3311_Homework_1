package problem_3;

import java.util.Scanner;

public class Program_3 
{
	/*
	 * Created by Jordan Lim
	 */
	public static void main(String[] args) 
	{
		Scanner textreader = new Scanner(System.in);
		System.out.println("Enter in the weights (in pounds [lb]) and prices of each bag of sugar, respectively and press enter to continue:");
		double weight1 = textreader.nextDouble();
		double price1 = textreader.nextDouble();
		double weight2 = textreader.nextDouble();
		double price2 = textreader.nextDouble();
		// Declares weights and prices of each bag, respectively
		double pricedivweight1;
		// Uses formula to calculate the price per weight
		double pricedivweight2;
		// Uses formula to calculate the price per weight
		double pricedivweight1f;
		// Uses formula to calculate the price per weight final
		double pricedivweight2f;
		// Uses formula to calculate the price per weight final
		if (weight1 <= 0 || price1 <= 0 || weight2 <= 0 || price2 <= 0)
		{
			while (weight1 <= 0 || price1 <= 0 || weight2 <= 0 || price2 <= 0) 
				{
					System.out.println("One or more of your inputs may be negative. Please try again.");
					weight1 = textreader.nextDouble();
					price1 = textreader.nextDouble();
					weight2 = textreader.nextDouble();
					price2 = textreader.nextDouble();
				}
		}
		pricedivweight1 = price1/weight1;
		// Uses formula to calculate the price per weight
		pricedivweight2 = price2/weight2;
		// Uses formula to calculate the price per weight
		pricedivweight1f = ((pricedivweight1 * 100.00) / 100.00);
		pricedivweight2f = ((pricedivweight2 * 100.00) / 100.00);
		
		if (pricedivweight1f < pricedivweight2f)
		{
			System.out.println("The first bag of sugar has the better value.");
		}
		else 
		{
			System.out.println("The second bag of sugar has the better value.");
		}
		textreader.close();
	}

}

