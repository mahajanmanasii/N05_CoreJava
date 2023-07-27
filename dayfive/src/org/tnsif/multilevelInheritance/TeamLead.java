//parent class2/child class2
package org.tnsif.multilevelInheritance;

public class TeamLead extends Manager
{
       private String leadName;
       private int empID;
       private String projectName;
       
       //default constructor
	
       public TeamLead() {
		super();
		// TODO Auto-generated constructor stub
	}

//getters and setters	

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
      

	//parameterized constructor
       public TeamLead(String departmentName, String name, int empid, String leadName, int empID, String projectName) {
		super();
		this.leadName = leadName;
		this.empID = empID;
		this.projectName = projectName;
		
		//
		
	}
	
       
}
