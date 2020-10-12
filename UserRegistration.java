package userregistrationday6.userregistration;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface Validating{
	public boolean validate(String entryPoint) throws InvalidEntryPointException ;
}

public class UserRegistration {
	private final static Logger logger=LogManager.getLogger(UserRegistration.class);
	static Scanner feedInput = new Scanner(System.in);
	List<User> usersList;
	
	
	public  Validating nameCheck=firstName->{
		if (firstName.matches("^[A-Za-z0-9]{3,25}$")) {
			return true;
		} else {
			throw new InvalidEntryPointException(ExceptionType.FIRSTNAME_WRONG,"INVALID FIRST NAME");
		}
	};
	
	
	public  Validating emailCheck=emailId->{
		if (emailId.matches("^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?")) {
			return true;
		} else {
			throw new InvalidEntryPointException(ExceptionType.EMAILID_WRONG,"INVALID EMAIL ID");
		}
	};
	
	
	public  Validating phoneCheck=phoneNumber->{
		if (phoneNumber.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}")) {
			return true;
		} else {
			throw new InvalidEntryPointException(ExceptionType.PHONENUMBER_WRONG,"INVALID PHONENUMBER");
		}
	};
	
	
	public  Validating passwordCheck=password->{
		if (password.matches("[a-zA-Z0-9]*[^a-z^A-Z^0-9^ ]*[a-zA-Z0-9]*")) {
			return true;
		} else {
			throw new InvalidEntryPointException(ExceptionType.PASSWORD_WRONG,"INVALID PASSWORD");
		}
	};
	
	public UserRegistration() {
		
		usersList = new ArrayList<User>();
	}
	
	public void addInfoOfUsers() {
		
			logger.debug("Enter  first name: ");
			String firstName = feedInput.nextLine();
			logger.debug("Enter  last name: ");
			String lastName = feedInput.nextLine();
			logger.debug("Enter  email-Id: ");
			String emailId = feedInput.nextLine();
			logger.debug("Enter  phone number: ");
			String phoneNumber = feedInput.nextLine();
			logger.debug("Enter  password: ");
			String password = feedInput.nextLine();
				try {
					if (nameCheck.validate(firstName) && nameCheck.validate(lastName) && emailCheck.validate(emailId) && phoneCheck.validate(phoneNumber) && passwordCheck.validate(password)) {
						usersList.add(new User(firstName, lastName, emailId, phoneNumber, password));
					}
				} catch (InvalidEntryException e) {
					logger.debug(e.getMessage());
				}
			
			
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addInfoOfUsers();
		userRegistration.usersList.forEach(user->logger.debug(user));
		feedInput.close();
	}
}

class User {
	public String firstName;
	public String lastName;
	public String emailId;
	public String phoneNumber;
	public String password;

	public User(String firstName, String lastName, String emailId, String phoneNumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNo) {
		this.phoneNumber = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmail(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}
