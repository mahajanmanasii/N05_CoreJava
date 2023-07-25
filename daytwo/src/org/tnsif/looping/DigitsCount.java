package org.tnsif.looping;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) 
	{
           @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
           int digit = 0;
           int number= s.nextInt();
           do
           {
        	    number = number/10;
        	    digit++;
           }
           
           while(number!=0);
           {
           System.out.println("Total number of digits:" + digit);
           }
	}

}
