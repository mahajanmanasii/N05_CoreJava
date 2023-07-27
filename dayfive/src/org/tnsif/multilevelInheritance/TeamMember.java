//child class 1
package org.tnsif.multilevelInheritance;

public class TeamMember extends TeamLead
{
     private int size;
     private int duration;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public TeamMember(String departmentName, String name, int empid, String leadName, int empID2, String projectName, int size, int duration) {
		super(departmentName, name, empid, leadName, empID2, projectName);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.duration=duration;
		
	}
	
     
	
 	
     
     
}
