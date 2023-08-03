package org.tnsif.statickeyword;

public class Tiger extends Animal
{
	void eat()
	{
		System.out.println("eating:child");
	}
	static void run()
	{
		//we cant override static method
		
		System.out.println("running:child");
	}
	

}
