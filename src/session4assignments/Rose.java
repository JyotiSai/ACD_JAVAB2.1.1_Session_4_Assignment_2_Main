package session4assignments; //Package declaration

/**
 * This is the child class Rose which demonstrates Is-A (Flower) and Has-A
 * (Petals) relationship and shows which one is better.
 *
 */
public class Rose extends Flower {
	public void rose_opening() // This method accesses components from Petals class
	{
		/*
		 * Since Rose cannot extend Petals class, the methods of the latter are accessed
		 * via object creation. This shows that when inheritance is not involved,
		 * composition is better for code-reusability. Also, when inheritance is not
		 * involved, the disadvantage of change in base class affecting all subclasses
		 * can be avoided using composition.
		 */

		Petals rose_petals = new Petals(); // Creating object of class Petals
		rose_petals.opening(); // Method call to class Petals
	} // End of method
} // End of class
