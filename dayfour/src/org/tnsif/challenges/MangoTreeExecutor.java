/*Pratik is so much interested in gardening,hence he plants more trees in his garden.
 * He plants trees in rectangular fashion with the order of rows and columns and numbers the
 * trees in a row wise order.He planted the mango tree only in first row, first column and last column.
 * So given the tree number and rows and columns. your task is to find out whether the given tree is mango tree or not.input n=5,t=11*/
package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor 
{
    static void mangoTree(int n,int t)
    {
    	if(t%n==0 || t%n==1 || t<=n)
    	{
    		System.out.println("It is a mango tree");
    	}
    	else
    	{
    		System.out.println("It is not the mango tree");
    	}
    }
	public static void main(String[] args) 
	{
	     @SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
	     int n= s.nextInt();
	     int t=s.nextInt();
	     mangoTree(n, t);
	     

	}

}
