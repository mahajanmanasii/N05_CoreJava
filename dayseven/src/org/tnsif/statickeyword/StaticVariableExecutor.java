package org.tnsif.statickeyword;

public class StaticVariableExecutor 
{

	static int num =67;
	
	public static void main(String[] args) 
	{
		/*if any variable is non static and outside the main 
		function and we want to access it inside the main function,then we can make use of static keyword*/
	     System.out.println(num);

	}

}
