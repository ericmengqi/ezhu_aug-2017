/* Eric Zhu
 * September 5, 2017
 * This is our home grown library that will 
 * contain various mathematical methods.
 */
public class Calculate {

	// This method takes an integer and returns its square
	public static int square(int a) {
		return a * a;
	}

	// This method takes an integer and returns its cube
	public static int cube(int operand) {
		return operand * operand * operand;
	}

	// This method takes two doubles and returns the average
	public static double averageTwo(double operand1, double operand2) {
		return (operand1 + operand2) / 2;
	}

	// This method takes three doubles and returns the average
	public static double averageThree(double operand1, double operand2, double operand3) {
		return (operand1 + operand2 + operand3) / 3;
	}

	// This method takes an angle measure given in radians and converts it to
	// degrees
	public static double toDegrees(double operand) {
		return operand * (180 / 3.14159);
	}

	// This method converts an angle measure given in degrees and converts it to
	// radians
	public static double toRadians(double operand) {
		return operand * (3.14159 / 180);
	}

	/*
	 * This method returns the values of the discriminant from the coefficients of a
	 * quadratic equation
	 */
	public static double discriminant(double a, double b, double c) {
		//Equation for discriminant is b^2-4ac.
		return b * b - 4 * a * c;
	}

	// This method converts a mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		//Calculates the numerator.
		int newNum = (whole * denominator) + numerator;
		return newNum + "/" + denominator;
	}

	// This method converts an improper fraction into a mixed number
	public static String toMixedNum(int a, int b) {
		//Calculates the numerator
		int remain = a % b;
		//Calculates the whole number.
		int newNum = a / b;
		return newNum + " " + remain + "/" + b;
	}

	/*
	 * This method converts a binomial multiplication of form (ax + b)(cx + d) into
	 * a quadratic equation of the form ax^2 + bx + c
	 */
	public static String foil(int a, int b, int c, int d, String variable) {
		return a * c + variable + "^" + 2 + "+" + ((a * d) + (b * c)) + variable + b * d;
	}

	// This method determine whether or not one integer is evenly divisible by
	// another.
	public static boolean isDivisibleBy(int a, int b) {
		// Check if denominator is zero, which will not compute
		if (b == 0) {
			throw new IllegalArgumentException("Input is negative, cannot divide by 0");
		}
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

	// This method returns the absolute value of the number passed.
	public static double absValue(double a) {
		if (a >= 0) {
			return a;
		} else {
			return a * -1;
		}

	}

	// This method returns the larger of two values.
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// This method returns the smaller of two values.
	public static double min(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}

	}

	// This method rounds a double correctly to 2 decimal places.
	public static double round2(double a) {
		a = a * 100;
		//Cast as integer to eliminate any numbers after the hundreths place.
		int b = (int) a;
		double c = b;
		return a = c / 100;
	}

	// This method raises a value to a positive integer power.
	public static double exponent(double base, int power) {
		// Checks if exponent is negative.
		if (power < 1) {
			throw new IllegalArgumentException("Input is negative, cannot take value to negative power");
		}
		double newNum = base;
		for (int i = 1; i <= power; i++) {
			newNum *= base;
		}
		return newNum;
	}

	// This method returns the factorial of the value given.
	public static int factorial(int a) {
		// Checks if factorial is negative
		if (a < 1) {
			throw new IllegalArgumentException("Input is negative, cannot take factorial of negative number");
		}
		int newNum = a;
		for (int i = 1; i < a; i++) {
			newNum = newNum * (a - i);
		}
		return newNum;
	}

	//This method indicates whether an integer is prime or not 
	public static boolean isPrime (int a) {
		for (int i = 2; i < a; i++) {
			//Checks to see if any number other than itself is divisible.
			if (isDivisibleBy(a, i) == true) {
				return false;
			}
		}
		return true;

	}
	
	//This method provides the greatest common factor between two integers
	public static int gcf (int a, int b) {
		if (isDivisibleBy(a, b)){
			return b;
		} else {
			return gcf(b, a % b);
		}
	}

	//This method provides the square root of a double
	public static double sqrt(double a){
		if (a < 0) {
			throw new IllegalArgumentException("Input is negative, cannot take square root of negative number");
		}
		double num1;
		double root = a / 2;
		do {
			num1 = root;
			root = (num1 + (a / num1)) / 2.0;
		} while ((num1 - root) != 0);
		return round2(root);
	}

	/*
	 * This method uses the coefficients of a quadratic equation and uses the
	 * quadratic formula to approximate the real roots
	 */
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		} else if (discriminant(a, b, c) == 0) {
			/*
			 * With discriminant equal to zero, the rest of the
			 * quadratic equation will be -b / 2a. 
			 */
			String root = round2(-b / (2 * a)) + "";
			return root;
		} else {
			//Evaluate for both roots
			double root1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			double root2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
			//Evaluate which root is greater in order to place from least to greatest.
			if (root1 < root2) {
				String roots = round2(root1) + " and " + round2(root2);
				return roots;
				
			} else {
				String roots = round2(root1) + " and " + round2(root2);
				return roots;
		}
	}
}
}