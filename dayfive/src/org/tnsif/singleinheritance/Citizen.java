package org.tnsif.singleinheritance;
//Base class
public class Citizen 
{
       private String city;
       private int pincode;
       private long aadharNo;
       private long contact;
       
   //default    
       
       public Citizen() 
       {
		System.out.println("Default Constructor");	
	   }
  
       
       //parameterized
	public Citizen(String city, int pincode, long aadharNo, long contact) 
       {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contact = contact;
		
		System.out.println("Parameterized Constructor");
	   }
	//getters and setters
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public int getPincode() 
	{
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	public long getAadharNo() 
	{
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) 
	{
		this.aadharNo = aadharNo;
	}
	public long getContact() 
	{
		return contact;
	}
	public void setContact(long contact) 
	{
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contact=" + contact
				+ "]";
	}
       
	
	
       
}
