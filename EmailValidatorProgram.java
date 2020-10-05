
//SURAJMAL KUMAR


//User Registration Program

//Use case 9 i.e. Checking for the All email Pass..

//https://github.com/surajkumar7252/UserRegistration.git



import java.util.Scanner;
import java.util.regex.*;


public class EmailValidatorProgram {
	
	private Pattern lastNamePattern;
	private Pattern firstNamePattern;
	private Pattern emailPattern;
	private Pattern phoneNumberPattern;
	private Pattern passwordPattern;
	private Pattern passwordPattern3;
	private Pattern passwordPattern4;
	
	private Matcher matchPatternLastName;
	private Matcher matchPatternFirstName;
	private Matcher matchPatternEmail;
	private Matcher matchPatternPhone;
	private Matcher matchPatternPassword;
	private Matcher matchPatternPassword3;
	private Matcher matchPatternPassword4;
	
	
	static Scanner lastnamefeed= new Scanner(System.in);
	static Scanner firstnamefeed= new Scanner(System.in);
	static Scanner emailFeed= new Scanner(System.in);
	static Scanner phoneFeed= new Scanner(System.in);
	static Scanner password= new Scanner(System.in);
	
	
	
    private static final String CHECK_NAME_TEMPLATE ="^[A-Za-z0-9]{3,25}$";
    private static final String CHECK_EMAIL_TEMPLATE ="^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?";
    private static final String CHECK_PHONE_NUMBER_TEMPLATE ="^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}";
    private static final String CHECK_PASSWORD_TEMPLATE =".*[A-Z].*+";
    private static final String CHECK_PASSWORD_TEMPLATE3 =".*[0-9].*";
    private static final String CHECK_PASSWORD_TEMPLATE4 ="[a-zA-Z0-9]*[^a-z^A-Z^0-9^ ]*[a-zA-Z0-9]*";
    
     
    
   public EmailValidatorProgram(){
	
		firstNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		lastNamePattern=Pattern.compile(CHECK_NAME_TEMPLATE);
		emailPattern=Pattern.compile(CHECK_EMAIL_TEMPLATE);
		phoneNumberPattern=Pattern.compile(CHECK_PHONE_NUMBER_TEMPLATE);
		passwordPattern=Pattern.compile(CHECK_PASSWORD_TEMPLATE);
		passwordPattern3=Pattern.compile(CHECK_PASSWORD_TEMPLATE3);
		passwordPattern4=Pattern.compile(CHECK_PASSWORD_TEMPLATE4);
		
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
	
	public boolean checkPassword( String pass)
	{
		matchPatternPassword=passwordPattern.matcher(pass);
		return matchPatternPassword.matches();
	}
	
	public boolean checkPassword3( String pass)
	{
		matchPatternPassword3=passwordPattern3.matcher(pass);
		return matchPatternPassword3.matches();
	}
	
	public boolean checkPassword4( String pass)
	{
		matchPatternPassword4=passwordPattern4.matcher(pass);
		return matchPatternPassword4.matches();
	}
	
	
	
	public static void main(String[] args) {
		
		String[] sampleEmailList=new String[]{"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
				                              "abc@1.com","abc@gmail.com.com","abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com",
				                              "abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		
		
		System.out.println("Enter the First Name: ");
		String firstName=firstnamefeed.nextLine();

		System.out.println("Enter the Last Name: ");
		String lastName=lastnamefeed.nextLine();
		
		
		System.out.println("Enter the Phone Number: ");
		String phone=phoneFeed.nextLine();
		
		System.out.println("Enter the Password: ");
		String pass = password.nextLine();
		
		EmailValidatorProgram lastNameCheck = new EmailValidatorProgram();
		EmailValidatorProgram firstNameCheck = new EmailValidatorProgram();
		EmailValidatorProgram emailCheck = new EmailValidatorProgram();
		EmailValidatorProgram phoneCheck = new EmailValidatorProgram();
		EmailValidatorProgram passwordCheck = new EmailValidatorProgram();
		EmailValidatorProgram passwordCheck3 = new EmailValidatorProgram();
		EmailValidatorProgram passwordCheck4 = new EmailValidatorProgram();
		
		
		boolean firstResponse=firstNameCheck.checkLastName(firstName);
		boolean lastResponse=lastNameCheck.checkLastName(lastName);
		boolean phoneResponse=phoneCheck.checkPhoneNumber(phone);
		boolean passwordResponse=passwordCheck.checkPassword(pass);
		boolean passwordResponse3=passwordCheck3.checkPassword3(pass);
		boolean passwordResponse4=passwordCheck4.checkPassword4(pass);
		
		for(String emailSample:sampleEmailList){
			String email=emailFeed.nextLine();
			boolean emailResponse=emailCheck.checkEmail(email);
			if(emailResponse) {
				System.out.println("Email ID  is Correct.");
			}
			else if(!emailResponse) {
				System.out.println("Wrong Email ID.");
			}
		}
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
		
		
		if(phoneResponse) {
			System.out.println("Phone Number is Correct.");
		}
		else if(!phoneResponse) {
			System.out.println("You entered a Wrong Phone Number.");
		}
		
		if (pass.length()>=8 && passwordResponse && passwordResponse3 && passwordResponse4) {
			System.out.println("Password is Correct.");
			} 
		else {
			System.out.println("Invalid  password");
			
		}
			
}
	
}

