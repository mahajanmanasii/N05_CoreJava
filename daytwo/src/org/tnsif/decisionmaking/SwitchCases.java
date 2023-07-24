//Program to execute switch cases
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCases 
{

	public static void main(String[] args) 
	{
           @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
           int songno=s.nextInt();
          
           switch (songno)
           {
           case 1:
           System.out.println("Perfect");
           break;
          
           case 2:
        	   System.out.println("Raabta");
        	   break;
           
           case 3:
        	   System.out.println("Ik Wari aa");
        	   break;
        	   
           case 4:
        	   System.out.println("Taki taki");
        	   break;
        	   
        	   default:
        		   System.out.println("Invalid input");
           }
	}

}
