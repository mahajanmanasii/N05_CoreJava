//program to demonstrate user input
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner s= new Scanner(System.in);
           
           System.out.println("Enter the value of num");
           int num=s.nextInt();
           System.out.println("The value of num is"+ num);
           
           System.out.println("Enter the value of num1");
           float num1=s.nextFloat();
           System.out.println("The value of num is"+ num1);
           
           char c=s.next().charAt(0);
           System.out.println("Character is " +c);
           
           System.out.println("Enter the String");
           String str1=s.nextLine();
           s.next();
           System.out.println("string is " + str1);
            
	}

}
