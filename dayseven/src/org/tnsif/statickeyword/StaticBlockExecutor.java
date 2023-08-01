package org.tnsif.statickeyword;

public class StaticBlockExecutor 
{

	static float salary;
	String companyName;
	
	//static block is used to initialize static variable.Value for any non static variable can't be assigned in static block.
	static 
	{
		//companyName="Accenture";
		salary=87769.99f;
	}
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) 
	{
		
       print();
	}

}
