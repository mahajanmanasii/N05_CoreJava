/*There are n people standing in a circle waiting to be executed. Counting out begins at some point
 * in the circle and proceeds around circle in a fix direction.In each step a certain no. of people are skipped
 * and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and 
 * smaller as the executed people are removed),until only the last person remains who is given freedom.
 * Given that total no of person n and k which indicates that k-1 person are skipped and the kth person is killed 
 * in a circle.The task is to choose the person in initial circle that survives. suppose n=10 and k=2*/
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleChallenge 
{
    static int survive(int n,int k)
    {
    	if(n==1)
    		return 1;
    	else
    		return(survive(n-1,k)+k-1)%n+1;
    }
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}


