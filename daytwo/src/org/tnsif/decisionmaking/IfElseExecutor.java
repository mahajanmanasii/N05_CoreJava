//program to execute if else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor 
{

	public static void main(String[] args) 
	{
	       @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	       int age=s.nextInt();
	       int weight=s.nextInt();
	       if(age>18 && weight >50)
	       {
	    	   System.out.println("Eligible to donate");
	       }
	       else
	       {
	    	   System.out.println("Not eligible");
	       }

	}

}
