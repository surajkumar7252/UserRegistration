
//SURAJMAL KUMAR

//User Registration Program

//Use case 2 i.e. Checking for the correct Last Name.

//https://github.com/surajkumar7252/UserRegistration.git



import java.util.Scanner;
import java.util.regex.*;


public class EmailValidatorProgram {
	
	private Pattern LastNamePattern;
	private Matcher matchPattern;
	
	static Scanner sc= new Scanner(System.in);
	
	private static final String CHECK_LAST_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
	
	public EmailValidatorProgram(){
		
		LastNamePattern=Pattern.compile(CHECK_LAST_NAME_TEMPLATE);
		}

	public boolean check( String lastName)
	{
		matchPattern=LastNamePattern.matcher(lastName);
		return matchPattern.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Last Name: ");
		String lastName=sc.nextLine();
		EmailValidatorProgram lastNameCheck = new EmailValidatorProgram();
		boolean value=lastNameCheck.check(lastName);
		if(value) {
			System.out.println("Last Name is Correct.");
		}
		else if(!value) {
			System.out.println("You entered a Wrong Last Name.");
		}
			
}
	
}

