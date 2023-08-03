package org.tnsif.statickeyword;

public class Animal {

	void eat()
	{
		System.out.println("eating");
	}
	static void run()
	{
		//we can't override static method
		
		System.out.println("running");
	}
}
