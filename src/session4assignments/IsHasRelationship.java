package session4assignments; //Package declaration

/**
 * This class passes arguments and performs method call.
 *
 *
 */
public class IsHasRelationship {
	public static void main(String[] args) // This is the main method
	{
		Rose beach_rose = new Rose(); // Object of Rose class created
		beach_rose.set_colour("Red"); // Passing color as argument
		beach_rose.set_numberOfPetals(5); // Passing number of petals as argument
		beach_rose.flower_properties(); // Method call to print the properties: color and number of petals
		beach_rose.rose_opening(); // Method call to print functionality
	} // End of main method
} // End of class
