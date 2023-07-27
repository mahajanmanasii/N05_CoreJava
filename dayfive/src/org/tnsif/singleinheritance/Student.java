package org.tnsif.singleinheritance;
//Derived class
public class Student extends Citizen
{
	private int rollNo;
	private String CollegeName;
	
	public Student() 
	{
		super();
		System.out.println("child class default constructor");
	}
	public Student(String city, int pincode, long aadharNo, long contact,int rollNo, String collegeName) 
	{
		super(city, pincode, aadharNo, contact);
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String collegeName) 
	{
		super();
		this.rollNo = rollNo;
		CollegeName = collegeName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", CollegeName=" + CollegeName + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
