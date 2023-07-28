/*Ask the user for their birth year encoded as 2 digits (like "62") and for the current year also enocoded as 
 * 2 digit (like "99") write a program to find users current age in years */
package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCount 
{
	static void ageCount(int birthYear, int currentYear)
	{
		if(birthYear<currentYear )
		{
			System.out.println(currentYear-birthYear);
		}
		else
		{
			System.out.println(100+currentYear-birthYear);
		}
	}

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the BirthYear As well as currentYear");
		int birthYear=s.nextInt();
		int currentYear=s.nextInt();
		ageCount(birthYear,currentYear);

	}

}
