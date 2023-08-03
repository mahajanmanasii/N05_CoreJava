package org.tnsif.finalkeyword;

public class FinalVariable 
{
	//The blank final field may not have been initialized
       //final int NUM;
	
	final float SALARY=56000.89f;
	public void print()
	{
		//The final field FinalVariable.SALARY cannot be assigned
		//SALARY=98000.98f;
		System.out.println("SALARY IS Rs. "+SALARY);
	}
}
