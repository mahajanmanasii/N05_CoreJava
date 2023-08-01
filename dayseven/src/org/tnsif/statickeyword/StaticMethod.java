package org.tnsif.statickeyword;

public class StaticMethod 
{
    int x=2;
    static String collegeName="MET";
    /*if any method outside the main function and if you want to access that method inside main function
     * we have1	`		` to make that method STATIC*/
    
    public static void print()
    {
    	System.out.println(collegeName);
    	/*we can not take non static variable inside static method*/
    	//System.out.println(x);
    }
	public static void main(String[] args) 
	{
	print();
	}

}
