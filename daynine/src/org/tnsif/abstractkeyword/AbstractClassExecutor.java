package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can not create object for abstract class.
		//Operator o=new Operator();
		Addition a=new Addition();
		a.print(10, 20);
		a.operation();
	}

}
