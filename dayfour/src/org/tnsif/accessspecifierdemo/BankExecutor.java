package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.Bank; //or.*
public class BankExecutor 
{

	public static void main(String[] args) 
	{
		Bank b = new Bank();
        b.bankName="SBI";
        b.displayPublic();
        /*pin no and displayPrivate methods are private, so we can't access 
         * into another class and another package ,they can be only accessed  
          inside same class*/
        //b.pinNo;
        //b.displayPrivate
        
        /*accountNo and displayDefault method are default ,thus not accessible in another package,
         * can only accessed within the same package*/
        //b.accountNo;
         //b.displaydefault
         
	}

}
