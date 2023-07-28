//program to demonstrate on access specifier
package org.tnsif.accessspecifier;

public class Bank 
{
	   //different access specifiers
       public String  bankName;
       private int pinNo;
       long accountNo=33344455566677L;
       
       //public method
       public void displayPublic()
       {
    	   System.out.println("Bank name : "+bankName);
       }
       
       //private method
       @SuppressWarnings("unused")
	private void displayPrivate()
       {
    	   System.out.println("Pin No.: "+pinNo);
       }
       
       //default method
       void displayDefault()
       {
    	   System.out.println("Account No. : "+accountNo);
       }
}
