package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood
{
    String str1,str2,str3;	
    
    static void display(String str1,String str2)
    {
    	System.out.println(str1+"loves"+str2);
    	
    }
    
    static void display(String str1,String str2,String str3)
    {
    	System.out.println(str1+"loves"+str2+"and"+str3);
    	
    }
}
public class MethodOverloadingExecutor 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Engter the three strings");
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		Bollywood.display(str1,str2);
		Bollywood.display(str1, str2, str3);


	}

}
