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
	 public static double discriminant(double operandA, double operandB, double operandC) {
		return operandB * operandB - 4 * operandA * operandC;
	}

	// This method converts a mixed number into an improper fraction
	public static String toImproperFrac(int a, int b, int c) {
		int newNum = (a * c) + b;
		return newNum + "/" + c;
	}

	// This method converts an improper fraction into a mixed number
	public static String toMixedNum(int a, int b) {
		int remain = a % b;
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
	// another
	public static boolean isDivisibleBy(int a, int b) {
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
	public static double round2 (double a) {
		 a = a * 100;
		 int b = (int) a;
		 double c = b;
		 return a = c/100;
		}
	
	//This method raises a value to a positive integer power.
	public static double exponent (double a, int b) {
		double newNum = a;
		for (int i =  1; i <= b ; i++) {
			newNum *= a;
		}
		return newNum;
	}
	
	//This method returns the factorial of the value given.
	public static int factorial (int a) {
		int newNum = a;
		for (int i = 1; i < a; i++) {
			newNum = newNum * (a-i);
		}
		return newNum;
	}
	
	//This method indicates whether an integer is prime or not 
	public static boolean isPrime (int a) {
		for (int i = 2; i < a; i++) {
			
			if(isDivisibleBy (a, i) == true) {
				return false;
			}
		}
		return true;
		
	}
	
	//This method provides the greatest common factor between two integers
	public static int gcf (int a, int b) {
		if (isDivisibleBy(a, b)){
			return b;
		}
		else{
			return gcf(b, a%b);
		}
	}
	
	//This method provides the square root of a double
	public static double sqrt(double a){
		double num1;
		double root = a / 2;
		do {
			num1 = root;
			root = (num1 + (a / num1)) / 2.0;
		} while ((num1 - root) != 0);
		return round2(root);
	}
}


