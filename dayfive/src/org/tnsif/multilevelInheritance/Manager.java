//Parent class 1
package org.tnsif.multilevelInheritance;

public class Manager 
{
   private String departmentName;
   private String Name;
   private int empid;

   //default constructor
   public Manager() 
   {
	super();
	System.out.println("Default Constructir-Manager");
	// TODO Auto-generated constructor stub
   }

   
   //parameterized constructor
   public Manager(String departmentName, String name, int empid) 
   {
	super();
	this.departmentName = departmentName;
	this.Name = name;
	this.empid = empid;
	
	
}

   
   
@Override

public String toString() {
	return "Manager [departmentName=" + departmentName + ", Name=" + Name + ", empid=" + empid + "]";
}


//getter and setter
public String getDepartmentName() {
	return departmentName;
}


public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}
   
   
   
   
   
}
