package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		String res=(num%3==0)?"DivisibleBy3":"NotDivisibleBy3";
		System.out.println("number is "+ res);
		s.close();
	}

}
