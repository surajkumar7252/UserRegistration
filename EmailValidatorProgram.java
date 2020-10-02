//SURAJMAL KUMAR

//User Registration Program

//Use case 1 i.e. Checking for the correct First Name.

//https://github.com/surajkumar7252/UserRegistration.git



import java.util.Scanner;
import java.util.regex.*;


public class EmailValidatorProgram {
	
	private Pattern firstNamePattern;
	private Matcher matchPattern;
	
	static Scanner sc= new Scanner(System.in);
	
	private static final String CHECK_FIRST_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
	
	public EmailValidatorProgram(){
		
		firstNamePattern=Pattern.compile(CHECK_FIRST_NAME_TEMPLATE);
		}

	public boolean check( String firstName)
	{
		matchPattern=firstNamePattern.matcher(firstName);
		return matchPattern.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the First Name: ");
		String lastName=sc.nextLine();
		EmailValidatorProgram firstNameCheck = new EmailValidatorProgram();
		boolean value=firstNameCheck.check(lastName);
		if(value) {
			System.out.println("First Name is Correct.");
		}
		else if(!value) {
			System.out.println("You entered a Wrong First Name.");
		}
			
}
	
}

