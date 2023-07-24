//program to decide whether one is eligible for donating the blood or not.
package org.tnsif.operators;

import java.util.Scanner;

public class DecisionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int age=s.nextInt();
		int weight=s.nextInt();
		
		if ((age>=18)&&(weight>=50))
			System.out.println("Eligible for donating");
		else
			System.out.println("Not eligible for donating");

	}

}
