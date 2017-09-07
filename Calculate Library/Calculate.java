/* Eric Zhu
 * September 5, 2017
 * This is our home grown library that will 
 * contain various mathematical methods.
 */
public class Calculate {

	// This method takes an integer and returns its square
	public static int square(int operand) {
		return operand * operand;
	}
	
	// This method takes an integer and returns its cube
	public static int cube(int operand) {
		return operand * operand * operand;
	}
	
	// This method takes two doubles and returns the average
	public static double averageTwo (double operand1, double operand2) {
		return (operand1 + operand2) / 2;
	}

	// This method takes three doubles and returns the average
	public static double averageThree (double operand1, double operand2, double operand3 ) {
		return (operand1 + operand2 + operand3) / 3;
	}
	
	// This method takes an angle measure given in radians and converts it to degrees
	public static double toDegrees (double operand) {
		return operand * (180 / 3.14159);
	}
	
	// This method converts an angle measure given in degrees and converts it to radians
	public static double toRadians (double operand) {
		return operand * (3.14159 / 180);
				
	/* This method returns the values of the discriminant from the coefficients of 
	 * a quadratic equation
	 */
	public static double discriminant (double operandA, double operandB, double operandC ) {
			return operandB * operandB - 4 * operandA * operandC;
		}
	
	// This method converts a mixed number into an improper fraction
	public static toImproperFrac (double wholeNumber, double numerator, double denominator) {
		return (whole number * denominator + numerator)
	}
	
	
}

