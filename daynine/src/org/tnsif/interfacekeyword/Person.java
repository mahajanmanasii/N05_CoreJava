package org.tnsif.interfacekeyword;
//program to demonstrate on multiple inheritance
public class Person implements ColdDrink,Alcohol {

	@Override
	public void showDrinkName() {
		// TODO Auto-generated method stub
		System.out.println(brand+" "+ alcoholName+" "+name);
	}

}
