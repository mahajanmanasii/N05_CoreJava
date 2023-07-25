//driver class
//program to demonstrate class and objects
package org.tnsif.classnobject;

public class LaptopExecutor 
{

	public static void main(String[] args) 
	{
		//object creation
        Laptop device = new Laptop();
        device.company="HP";
        device.size=512;
        //method call
        device.display();
	}

}
