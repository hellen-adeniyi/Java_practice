import java.lang.*;
import java.util.*;

// program to read the name of a person from the keyboard and display a welcome message on the screen
public class Name
{
	public static void main(String args[])
	{	// take user input (string) what method do i use? dont forget to initialize
		Scanner s=new Scanner(System.in);
		String name;		
		name = s.next();
		// print welcome message (name + message)
		System.out.println("Welcome " + name);
	}
}
