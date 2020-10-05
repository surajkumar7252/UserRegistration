
//SURAJMAL KUMAR


//User Registration Program

//Use case 2 i.e. Checking for the Password..

//https://github.com/surajkumar7252/UserRegistration.git



import java.util.Scanner;
import java.util.regex.*;


public class EmailValidatorProgram {
	
	private Pattern lastNamePattern;
	private Pattern firstNamePattern;
	private Pattern emailPattern;
	private Pattern phoneNumberPattern;
	private Matcher matchPatternLastName;
	private Matcher matchPatternFirstName;
	private Matcher matchPatternEmail;
	private Matcher matchPatternPhone;
	
	static Scanner lastnamefeed= new Scanner(System.in);
	static Scanner firstnamefeed= new Scanner(System.in);
	static Scanner emailFeed= new Scanner(System.in);
	static Scanner phoneFeed= new Scanner(System.in);
	static Scanner password= new Scanner(System.in);
	
	
	
    private static final String CHECK_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
    private static final String CHECK_EMAIL_TEMPLATE ="^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?";
    private static final String CHECK_PHONE_NUMBER_TEMPLATE ="^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}";
    
   public EmailValidatorProgram(){
	
		firstNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		lastNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		emailPattern=Pattern.compile(CHECK_EMAIL_TEMPLATE);
		phoneNumberPattern=Pattern.compile(CHECK_PHONE_NUMBER_TEMPLATE);
		
		}
	
	
	public boolean checkLastName( String lastName)
	{
		matchPatternLastName=lastNamePattern.matcher(lastName);
		return matchPatternLastName.matches();
	}
	
	public boolean checkFirstName( String firstName)
	{
		matchPatternFirstName=firstNamePattern.matcher(firstName);
		return matchPatternFirstName.matches();
	}
	
	public boolean checkEmail( String email)
	{
		matchPatternEmail=emailPattern.matcher(email);
		return matchPatternEmail.matches();
	}
	
	public boolean checkPhoneNumber( String phone)
	{
		matchPatternPhone=phoneNumberPattern.matcher(phone);
		return matchPatternPhone.matches();
	}
	public static void main(String[] args) {
		System.out.println("Enter the First Name: ");
		String firstName=firstnamefeed.nextLine();

		System.out.println("Enter the Last Name: ");
		String lastName=lastnamefeed.nextLine();
		
		System.out.println("Enter the Email-Id: ");
		String email=emailFeed.nextLine();
		
		System.out.println("Enter the Phone Number: ");
		String phone=phoneFeed.nextLine();
		
		System.out.println("Enter the Password: ");
		String pass = password.nextLine();
		
		EmailValidatorProgram lastNameCheck = new EmailValidatorProgram();
		EmailValidatorProgram firstNameCheck = new EmailValidatorProgram();
		EmailValidatorProgram emailCheck = new EmailValidatorProgram();
		EmailValidatorProgram phoneCheck = new EmailValidatorProgram();
		
		boolean firstResponse=firstNameCheck.checkLastName(firstName);
		boolean lastResponse=lastNameCheck.checkLastName(lastName);
		boolean emailResponse=emailCheck.checkEmail(email);
		boolean phoneResponse=phoneCheck.checkPhoneNumber(phone);
		
		
		if(firstResponse) {
			System.out.println("First Name is Correct.");
		}
		else if(!firstResponse) {
			System.out.println("You entered a Wrong First Name.");
		}
		
		if(lastResponse) {
			System.out.println("Last Name is Correct.");
		}
		else if(!lastResponse) {
			System.out.println("You entered a Wrong Last Name.");
		}
		if(emailResponse) {
			System.out.println("Email ID  is Correct.");
		}
		else if(!emailResponse) {
			System.out.println("You entered a Wrong Email ID.");
		}
		
		if(phoneResponse) {
			System.out.println("Phone Number is Correct.");
		}
		else if(!phoneResponse) {
			System.out.println("You entered a Wrong Phone Number.");
		}
		
		if (pass.length()>=8) {
			System.out.println("Password is Correct.");
			} 
		else {
			System.out.println("Invalid entry for a password");
			
		}
			
}
	
}

