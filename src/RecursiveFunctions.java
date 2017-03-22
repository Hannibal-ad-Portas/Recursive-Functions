/**
 * Created by James on 3/21/2017.
 */
public class RecursiveFunctions {

	/**
	 * A method that evaluates an exponent recursively
	 * only works with integers
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int power(int base, int exponent)
	{
		int exp = exponent;

		if (base == 0)
			return 0;
		if (exp == 0)
			return 1;
		if (exp == 1)
			return base;
		else
			return multiplication( power( base, exp - 1), base);
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
			return multiplication(x, y - 1) +x;
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

	//TODO: create a method to revere a string using recursive calls
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
			for (int i = 0; i < size - 2; i++)
			{
				tempArray[i] = input.charAt(i);
			}
			String tempString = new String(tempArray);
			return input.charAt(size - 1) + tempString;
		}


	}

	//TODO: create a method to find the length of a linked list using recursive calls
//    public int linkedListLength () {
//
//    }

}
