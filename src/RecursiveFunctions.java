/**
 * Created by James on 3/21/2017.
 */
public class RecursiveFunctions {

	/**
	 * A method that evaluates an exponent recursively
	 * Uses the equality x^y = (x^2)^(y/2)
	 * only works with integers
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int power (int base, int exponent)
	{
		int exp = exponent;
		int solution = 0;

		if (exp == 0)
			solution = 1;
		if (base == 0)
			solution = 0;
		if (exp == 1)
			solution = base;
		else if ( exp % 2 == 0)
			solution = power ( base * base, exp / 2);
		else if ( exp % 2 != 0)
			solution = power ( base * base * base, exp / 2); // if the exponent is odd multiply by base three times

		return solution;
	}

	/**
	 * Method to evaluate multiplication through recursive addition
	 * only works with int values
	 * @param x
	 * @param y
	 * @return
	 */
	public static int multiplication (int x, int y)
	{
		if (y == 0 || x ==0)
			return 0;
		if (y == 1)
			return x;
		if (x == 1)
			return y;
		else
			return multiplication(x, y - 1) + x;

	}

	/**
	 * Finds the greatest common denominator using euler's algorithm recursively
	 * @param a
	 * @param b
	 * @return
	 */
	public static float gcDenominator (float a, float b)
	{
		float c = 0;
		if (a == b)
			c = a;
		if (a > b)
			c = gcDenominator(a - b, b);
		if ( a < b)
		{
			c = gcDenominator(a, b - a);
		}
		return c;
	}

	/**
	 *
	 * @param input
	 * @return
	 */
	public static String reverseString (String input)
	{
		int size = input.length();
		char[] tempArray = new char[size - 1];

		if (size == 0)
			return "";
		if (size == 1)
			return input;
		else
		{
			String tempString = input.replaceAll(String.valueOf(size - 1), "");
			return input.charAt(size - 1) + reverseString(tempString);
		}

	}


//    public int linkedListLength () {
//		if (n == null)
//			return 0;
//		if (n.next == null)
//			return 1;
//		else
//			return linkedListLength(n.next) + 1;
//    }

}