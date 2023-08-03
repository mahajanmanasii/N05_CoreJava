package org.tnsif.finalkeyword;

public class Circle extends Shapes
{
   final float area=45.76f;
   
   //final method 
   //Cannot override the final method from Shapes
   /*void printShapeType()
   {
	   System.out.println(area);
   }*/
   public void printShapeType(float area)
   {
	   System.out.println("area is "+area+" sq.cm");
   }
}
