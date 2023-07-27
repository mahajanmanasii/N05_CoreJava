//base class
package org.tnsif.hierarchicalInheritance;

public class Android 
{
   private String brandName;
   private String slotType;

   //getters and setters
   public String getBrandName() {
	return brandName;
}

   public void setBrandName(String brandName) {
	this.brandName = brandName;
}

   public String getSlotType() {
	return slotType;
}

   public void setSlotType(String slotType) {
	this.slotType = slotType;
}

@Override

public String toString() 
{
	return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
}

//default constructor

public Android() {
	super();
	// TODO Auto-generated constructor stub
}

//parametrized constructor
public Android(String brandName, String slotType) 
{
	super();
	this.brandName = brandName;
	this.slotType = slotType;
}
   
   
   
   
}
