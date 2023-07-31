// It can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne 
{
    int x,y;
    
    void setData(int x,int y)
    {
    	//we can change the name of parameters
    	this.x=x;
    	this.y=y;    	
    }
    
    void Display()
    {
    	System.out.println(x+" "+y);
    }
	public static void main(String[] args) 
	{
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setData(2,3);
		t.Display();
		
		

	}

}
