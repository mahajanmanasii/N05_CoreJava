package org.tnsif.interfacekeyword;

public interface DebitCard 
{
	  /*by default all variables inside interface are public, static, final & 
    	if it is final the we must have to initialize the value of variable*/
       long cardNo=585858585589l;
       
       //can't use concrete methods/methods with body in interface;by default it is an abstract method
       void displayCardDetails();
       
       //default method and static methods are new features of java 8  and can be used in interface.
       default void display()
       {
    	   System.out.println("Default Method");
       }
       
       static void print()
       {
    	   System.out.println("Static Method");
       }
       
    
}
