//program to demonstrate on encapsulation
//encapsulation achieves data hiding using private access specifier
package org.tnsif.encapsulation;

public class SBI 
{
       private long accountNo;
       private int cvvNo;
       private String accountType;
       private int pinNo;
       
       //setter method is used to set a value;getter method is used to return a value
	public long getAccountNo() 
	{
		return accountNo;
	}
	public void setAccountNo(long accountNo) 
	{
		this.accountNo = accountNo;
	}
	public int getCvvNo() 
	{
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) 
	{
		this.cvvNo = cvvNo;
	}
	public String getAccountType() 
	{
		return accountType;
	}
	public void setAccountType(String accountType) 
	{
		this.accountType = accountType;
	}
	public int getPinNo() 
	{
		return pinNo;
	}
	public void setPinNo(int pinNo) 
	{
		this.pinNo = pinNo;
		
	}
	@Override
	public String toString() 
	{
		return "SBI [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo
				+ "]";
	}
       
       
}
