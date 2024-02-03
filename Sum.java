import java.lang.*;
import java.util.*;

public class Sum
{
	public static void main(String args[])
		{
			
			
			// use system.out to display a message (that tells the user to enter two numbers)
			System.out.println("Enter two  integers you wish to add: ");
			// take input from user:use system.in to take in the inputs (as they will be coming from the keyboard)
			// create a scanner object 
			Scanner s=new Scanner(System.in);
			// create variables to hold each number
			int a,b;
			// initialize both of the inputs
			a = s.nextInt();  // the scanner object.method
			b = s.nextInt();
			// create a separate variable to hold the sum 
			int addition;
			// do the addition and store it in the sum variable
			addition=a+b;
			// display the sum using system.out
			System.out.println("The sum of " + a + " and" + b + " is " + addition);
		}
}