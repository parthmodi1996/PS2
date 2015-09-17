package MainPackage;
public class MyInteger {
	// Declare a variable value //
	private int value;
	//Create a constructor of class MyInteger //
	public MyInteger(int value) {
		this.value = value;
	}
	//Create a getter for variable value //
	private int getValue() {
		return this.value;
	}
	/**
	 * Create isEven() method with protected modifier 
	 * This method does not take in any parameter values and return true if the value is Even,
	 * it return false otherwise
	 */
	protected boolean isEven() {
		//Check the condition for even //
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Create isOdd() method with protected modifier 
	 * This method does not take in any parameter values and return true if the value is Odd,
	 * it return false otherwise
	 */
	protected boolean isOdd() {
		// Check the condition for isOdd() //
		if (this.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Create isPrime() method with protected modifier 
	 * This method does not take in any parameter values and return true if the value is Prime,
	 * it return false otherwise
	 */
	public boolean isPrime() {
		//Check the condition for isPrime() //
		for (int i = 2; i < this.getValue(); i++) {
			if (this.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Overload method isEven() by adding a parameter. 
	 * This method takes in one integer value as parameter and returns true if the value is Even,
	 * it return false otherwise
	 */
	protected static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Overload method isOdd() by adding a parameter. 
	 * This method takes in one integer value as parameter and returns true if the value is Odd,
	 * it return false otherwise
	 */
	protected static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Overload method isPrime() by adding a parameter. 
	 * This method takes in one integer value as parameter and returns true if the value is Prime,
	 * it return false otherwise
	 */
	protected static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Overload method isEven() by adding a parameter. 
	 * This method takes in the integer value passed onto class MyInteger and returns true if the value is Even,
	 * it return false otherwise
	 */
	protected static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	/**
	 * Overload method isOdd() by adding a parameter. 
	 * This method takes in the integer value passed onto class MyInteger and returns true if the value is Odd,
	 * it return false otherwise
	 */
	protected static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	/**
	 * Overload method isPrime() by adding a parameter. 
	 * This method takes in the integer value passed onto class MyInteger and returns true if the value is Prime,
	 * it return false otherwise
	 */
	protected static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	/**
	 * Create a method equals(int)
	 * This method takes in one integer value as parameter and checks if it is the same value as the
	 * one passed onto MyInteger.
	 */
	protected boolean equals(int check) {
		if (check == getValue()) {
			return true;
		}
		return false;
	}
	/**
	 * Create a method equals(MyInteger)
	 * This method takes in one integer value as parameter and checks if it is the same value as the
	 * one passed onto MyInteger.
	 */
	protected boolean equals(MyInteger check) {
		return check.equals(check);
	}
	/**
	 * Create a method parseInt(char).
	 * This method takes in one array of type character as parameter and returns the sum
	 * of all the integers in the array.
	 */
	protected static int parseInt(char[] args) {
		int sum = 0;
		//Analyze each element of the array using for loop //
		for (int i = 0; i < args.length; ++i) {
			//Check if the element is a number (integer) or not using ascii value of the character //
			if (47 < args[i] & 58 > args[i]) {
				//Add the numeric value of the character to sum variable //
				sum += Character.getNumericValue(args[i]);
			}
		}
		return sum;
	}
	/**
	 * Create a method parseInt(String).
	 * This method takes in one variable of type String as parameter and returns the integers
	 * of all the integers in the array.
	 */
	protected static int parseInt(String args) {
		int sum = 0;
		String justNum = "";
		//Create a string of just numbers from the parameter string //
		for (int i = 0; i < args.length(); ++i) {
			if (47 < args.charAt(i) & 58 > args.charAt(i)) {
				justNum += args.charAt(i);
			}
		}
		//Using the string containing just numbers, create integer of that string //
		for (int j = 0; j < justNum.length(); ++j) {
			// Perform the calculations to convert the string into numbers //
			int num = Character.getNumericValue(justNum.charAt(j));
			sum += (num) * Math.pow(10, (justNum.length() - j - 1));
		}
		return sum;
	}
}
