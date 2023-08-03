package org.tnsif.polymorphism;

import java.util.Scanner;

class Laptop
{
   	String generation;
     void specification(String generation,String generation2)
     {
    	 System.out.println("Laptop: "+generation);
     }
     
}

class Asus extends Laptop
{
     //String generation2;
     void specification(String generation,String generation2)
     {
	     super.specification(generation,generation2);
	     System.out.println("Asus: "+ generation2);
     }
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Asus a= new Asus();
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        @SuppressWarnings("unused")
		String generation=s.nextLine();
        String generation2=s.nextLine();
        a.specification(generation,generation2);
	}

}
