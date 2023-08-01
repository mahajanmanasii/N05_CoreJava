package org.tnsif.superkeyword;

class State
{
    String stateName="Goa";
    String capital="Panaji";
    
}


class Capital extends State
{
	 String stateName="Hariyana";
	 String capital="Chandigarh";
	 
	 void display()
	 {
		 /*super keyword is used to call parent class variable if and 
		 only if parent class and child class variable are same.*/
		 System.out.println(super.stateName);
		 System.out.println(stateName);
	 }
}
public class SuperKeywordWithVariable 
{

	public static void main(String[] args) 
	{
		Capital c=new Capital();
		System.out.println(c.stateName);
		c.display();

	}

}
