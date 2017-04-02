/**
 * Created by James on 3/21/2017.
 */
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		while (true) try {
			Scanner reader = new Scanner(System.in);
			System.out.println("Which Method do you want to test");
			System.out.println("0) Exit 1) Power 2) Multiplication 3) Euclid's Algorithm 4) Reverse String 5) Length of a Linked List");
			System.out.println("Enter the number associated with the desired method");

			int methodSelect = reader.nextInt();
			menu(methodSelect);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input");
			System.out.println("The input must be an integer");
		}

	}

	private static void menu(int methodSelect) {
		Scanner reader = new Scanner(System.in);
		try {
			if (methodSelect == 0) {
				System.exit(0);
			} else if (methodSelect == 1) {
				System.out.println("You have selected the power method");
				System.out.println("All of your inputs must be integers >= 0");
				System.out.print("Please enter your base: ");
				int base = reader.nextInt();
				System.out.println();
				System.out.print("Please enter your exponent: ");
				int exp = reader.nextInt();
				System.out.println();
				long out = RecursiveFunctions.power(base, exp);

				System.out.println("These evaluate to: " + out);

			} else if (methodSelect == 2) {
				System.out.println("You have selected the multiplication method");
				System.out.println("All of your inputs must be integers ");
				System.out.print("Please enter your x: ");
				int x = reader.nextInt();
				System.out.println();
				System.out.print("Please enter your y: ");
				int y = reader.nextInt();
				System.out.println();
				long out = RecursiveFunctions.multiplication(x, y);

				System.out.println("These evaluate to: " + out);
			} else if (methodSelect == 3) {
				System.out.println("You have selected the Euclids Algorithm method");
				System.out.println("All of your inputs must be integers >= 0");
				System.out.print("Please enter your x: ");
				int x = reader.nextInt();
				System.out.println();
				System.out.print("Please enter your y: ");
				int y = reader.nextInt();
				System.out.println();
				long out = RecursiveFunctions.gcDenominator(x, y);
				System.out.println("The Greatest Common Denominator is " + out);

			} else if (methodSelect == 4) {
				System.out.println("You have selected the Reverse String method");
				System.out.print("Please enter a string: ");
				String string = reader.next();
				String out = RecursiveFunctions.reverseString(string);
				System.out.println("This becomes: " + out + " When Reversed.");

			} else if (methodSelect == 5) {
				//Populates a linked list of random length with random float numbers
				LinkedList<Float> list = new LinkedList();
				int length = (int) BoilerPlate.random(0.0f, 100.0f);
				for (int i = 0; i < length; i++) {
					list.add(BoilerPlate.random(0.0f, 15.0f));
				}
				System.out.println("The size of this list is");
				System.out.println("as given by list.size: " + list.size());
				System.out.println("as given by the recursive function: " + RecursiveFunctions.linkedListLength(list));


			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println(methodSelect + " is not an option");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Invalid Input");
			System.out.println("The input must be an integer");
		}
	}

}

