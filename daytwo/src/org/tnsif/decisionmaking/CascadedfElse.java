//program to execute cascaded If else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedfElse 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
           Scanner s = new Scanner(System.in);
           int age1=s.nextInt();
           int age2=s.nextInt();
           int age3=s.nextInt();
           
           if(age1>age2 && age1>age3)
           {
        	   System.out.println("age1 is greater");
           }
           else if(age2>age1 && age2>age3)
           {
        	   System.out.println("age2 is grater");
           }
           else 
           {
        	   System.out.println("Age3 is greater");
           }
	}

}
