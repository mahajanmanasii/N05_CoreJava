package org.tnsif.interfacekeyword;
/*below annotation ensures that we have to use exactly one abstract method inside an functional interface.
 * An interface with exactly one abstact method is known as functional interface.   */
@FunctionalInterface
public interface PopCorn 
{
      void displayReceipe();
}
