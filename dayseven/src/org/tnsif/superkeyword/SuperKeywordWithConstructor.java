package org.tnsif.superkeyword;

class Nationality
{
   String nationality;

    public Nationality(String nationality) 
    {	
	 this.nationality = nationality;
	 System.out.println(nationality);
    }
   
}

class Person extends Nationality
{
	String language;
	public Person(String nationality, String language)
	{
		//calling to parent class constructor
		super(nationality);
		this.language = language;
        System.out.println(language);
	}
	
}
public class SuperKeywordWithConstructor 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Person p=new Person("Germany", "German");
		
	}

}
