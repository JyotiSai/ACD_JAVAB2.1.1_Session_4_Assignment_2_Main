package session4assignments; //Package declaration

/**
 * This is the Parent class Flower to child class Rose
 *
 */
public class Flower {
	String colour; // Colour property of flower declared as variable
	int number_of_petals; // Number of petals of flower declared as variable

	public void set_colour(String color) // This method defines color of flower
	{
		this.colour = color; // Initialization of colour of flower
	} // End of set_colour method

	public void set_numberOfPetals(int numberOfPetals) // This method defines number of petals of flower
	{
		this.number_of_petals = numberOfPetals; // Initialization of number of petals of flower
	} //End of numberOfPetals method

	public void flower_properties() // This method prints the colour and number of petals of flower
	{
		System.out.println("The colour of this flower is: " + colour);
		System.out.println("The number of petals in this flower is " + number_of_petals);
	} // End of flower_properties method
} // End of Flower class
