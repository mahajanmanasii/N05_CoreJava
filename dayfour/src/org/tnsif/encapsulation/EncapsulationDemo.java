//program to demonstrate on encapsulation
//encapsulation achieves data hiding using private access specifier
package org.tnsif.encapsulation;
public class EncapsulationDemo 
{

	public static void main(String[] args) 
	{
          SBI s=new SBI();
          s.setAccountNo(33344455566677L);
          s.setAccountType("Savings");
          s.setCvvNo(988);
          s.setPinNo(8888);
          
          System.out.println("BANK DETAILS");
          System.out.println("Account No: "+s.getAccountNo());
          System.out.println("Account Type: "+s.getAccountType());
          System.out.println("CVV No: "+s.getCvvNo());
          System.out.println("PIN No: "+s.getPinNo());
          
          System.out.println(s);
	}

}
