package userregistrationday6.userregistration;




import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest 
{
    
	@Test
	public void properFirstName_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkLastName("Surajmal");
		Assert.assertTrue(result);
	}
	
	@Test
	public void shortFirstName_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkFirstName("Su");
		Assert.assertFalse(result);
	}
	
	@Test
	public void improperFirstName_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPhoneNumber("Suraj$kr");
		Assert.assertFalse(result);
	}
	
	@Test
	public void properLastName_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkLastName("Kumar");
		Assert.assertTrue(result);
	}
	
	@Test
	public void shortLastName_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkLastName("Ku");
		Assert.assertFalse(result);
	}
	
	@Test
	public void improperLastName_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkLastName("@kum");
		Assert.assertFalse(result);
	}
	
	@Test
	public void properEmail_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkEmail("surajkumar_1234@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void improperEmail_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkEmail("surajkumar-1234@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void properPhoneNo_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPhoneNumber("91 8789685772");
		Assert.assertTrue(result);
	}
	
	@Test
	public void improperPhoneNo_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPhoneNumber("9187896857721");
		Assert.assertFalse(result);
	}
	
	@Test
	public void phoneNoWithSpecialCharacter_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPhoneNumber("91 87@89685772");
		Assert.assertFalse(result);
	}
	
	@Test
	public void alphabetsInPhoneNo_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPhoneNumber("91 878968op563");
		Assert.assertFalse(result);
	}
	
	@Test
	public void properPassword_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPassword("Heybro$");
		Assert.assertTrue(result);
	}
	
	@Test
	public void shortPassword_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.checkPassword("ab1$23");
		Assert.assertFalse(result);
	}
	
}