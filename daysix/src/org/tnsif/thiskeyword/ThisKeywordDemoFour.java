package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour 
{
	int x;
	
	//default constructor
	ThisKeywordDemoFour()
	{
		this(34);
		System.out.println("Defaullt Constructor");
	}

	//invoking current parameterised constructor
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor: "+x);
	}
	
	
	
	public static void main(String[] args) {
		ThisKeywordDemoFour t= new ThisKeywordDemoFour();
		

	}

}
