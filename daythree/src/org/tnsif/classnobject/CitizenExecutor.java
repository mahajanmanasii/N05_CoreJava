//driver class
//program to demonstrate on default and parameterized constructor
package org.tnsif.classnobject;

public class CitizenExecutor {

	public static void main(String[] args) 
	{
	    @SuppressWarnings("unused")
		Citizen c = new Citizen();
	    Citizen c1 = new Citizen("Adult",255396802976L,"female","Jalgaon");
	    
	    System.out.println(c1);
	}

}
