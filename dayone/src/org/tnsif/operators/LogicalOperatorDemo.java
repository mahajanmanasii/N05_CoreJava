package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println((6==7) && (7>4));
		System.out.println((6==7) || (7>4));
		System.out.println((6==7) || (7<4));
		System.out.println(!((6==7) && (7>4)));

	}

}
