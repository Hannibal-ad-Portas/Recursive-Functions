/**
 * Created by James on 3/21/2017.
 */
public class Program {
	public static void main (String[] args)
	{
		int x = 6;
		int y = 4;

		String string = "Hello World!";

		System.out.println("Power Function " + RecursiveFunctions.power( x, y));
		System.out.println("Multiplication Function " + RecursiveFunctions.multiplication( x, y));
		System.out.println("GCD Function" + RecursiveFunctions.gcDenominator( x, y));

		System.out.println("Reverse String " + RecursiveFunctions.reverseString(string));
	}
}
