import java.util.Scanner; // importing the Scanner - for user input

public class MyClass
{
	public static void main(String[] args) 
	{
		Scanner myInput = new Scanner(System.in); // initiating a new object Scanner
    
		System.out.println("Please enter your name: ");
		String myName = myInput.nextLine(); // reading the input as a String
		System.out.println("Your name is: " + myName);
	}
}
