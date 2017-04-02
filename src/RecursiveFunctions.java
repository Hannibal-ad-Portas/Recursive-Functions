import java.util.*;

/**
 * Created by James on 3/21/2017.
 */
public class RecursiveFunctions {

	/**
	 * A method that evaluates an exponent recursively
	 * Uses the equality x^y = (x^2)^(y/2)
	 * only works with integers
	 *
	 * @param base
	 * @param exponent
	 * @return solution a long variable
	 */
	public static long power(int base, int exponent) {
		int exp = exponent;
		long solution = 0;

		if (exp == 0)
			solution = 1;
		if (base == 0)
			solution = 0;
		if (exp == 1)
			solution = base;
		else if (exp % 2 == 0) {
			solution = power(base * base, exp / 2);
		} else if (exp % 2 != 0 && exp != 1) {
			solution = power(base * base, exp / 2) * base; // if the exponent is odd multiply by base three times
		}

		return solution;
	}

	/**
	 * Method to evaluate multiplication through recursive addition
	 * only works with int values
	 *
	 * @param x
	 * @param y
	 */
	public static int multiplication(int x, int y) {
		if (y == 0 || x == 0)
			return 0;
		if (y == 1)
			return x;
		if (x == 1)
			return y;
		else if (x >= 0 && y >= 0 || x <= 0 && y <= 0)
			return multiplication(x, y - 1) + x;
		else
			return -1 * (multiplication(x, y - 1) + x);

	}

	/**
	 * Finds the greatest common denominator using euler's algorithm recursively
	 *
	 * @param a
	 * @param b
	 */
	public static int gcDenominator(int a, int b) {
		int c = 0;
		if (a == b)
			c = a;
		if (a > b)
			c = gcDenominator(a - b, b);
		if (a < b) {
			c = gcDenominator(a, b - a);
		}
		return c;
	}

	/**
	 * A Method to return a string reversed.
	 * It uses recursive thinking and the StringBuilder class
	 *
	 * @param input
	 * @return
	 */
	public static String reverseString(String input) {
		int size = input.length();
		StringBuilder MutableString = new StringBuilder(input);

		if (size == 0)
			return "";
		if (size == 1)
			return input;
		else {
			char lastChar = input.charAt(size - 1);
			MutableString.deleteCharAt(size - 1);
			String resultsString = MutableString.toString();
			return lastChar + reverseString(resultsString);
		}
	}

	/**
	 * Returns the number of elements ins a linked list
	 * Not an optimal solution. removes all elements from the list.
	 *
	 * @param list
	 * @return
	 */
	public static int linkedListLength(LinkedList list) {
		Iterator<Float> iter;
		iter = list.listIterator();
		if (iter == null)
			return 0;
		if (iter.hasNext()) {
			if (iter.next() == null)
				return 1;
			else {
				list.remove();
				return 1 + linkedListLength(list);
			}
		}
		return 0;
	}
}

