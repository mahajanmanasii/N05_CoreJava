//program to execute nested if else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElse 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
           Scanner s = new Scanner(System.in);
           int age = s.nextInt();
           int weight=s.nextInt();
           
           if (age>=12)
           {
        	   if(weight>=40)
        	   {
        		System.out.println("Eligible for bunjee jumping.");
        		if(weight>110)
        		{
        			{System.out.println("Extra ropes will be added");}
        		}
        	   }
        	   else
        	   {
        		   System.out.println("Not Eligible for bunjee jumping");
        	   }
           }
           }
           
           

	}


