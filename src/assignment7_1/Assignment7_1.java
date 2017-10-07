package assignment7_1;

/**
 * @author MANJUNATH This class is to convert integer to String.
 */

// Class creation
public class Assignment7_1 {

	public static void main(String args[]) { // Main method
		int number = 123; // declare an integer
		String numberAsString = Integer.toString(number); // first way of converting int to string
		String numberToString = String.valueOf(number); // 2nd way of converting int to string
		System.out.println("First way of converting int to string: \n" + numberAsString); // display converted String
		System.out.println("Second way of converting int to string: \n" + numberToString); // display converted String
	}
}
