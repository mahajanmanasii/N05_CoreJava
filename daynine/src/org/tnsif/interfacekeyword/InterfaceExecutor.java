package org.tnsif.interfacekeyword;

public class InterfaceExecutor {

	public static void main(String[] args) 
	{
		   //Cannot instantiate the type DebitCard
	       //DebitCard d=new DebitCard();
		  SBIDebitCard d=new SBIDebitCard();
		  
		  //print is an static method inside interface,thats why to call it use interface.method();
		  DebitCard.print();
		  d.displayCardDetails();
		  d.display();

		  CheesePopCorn c= new CheesePopCorn();
		  c.displayReceipe();
		  
		  Person p=new Person();
		  p.showDrinkName();
	}

}
