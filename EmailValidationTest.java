package userregistrationday6.userregistration;

import java.util.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class EmailValidationTest {
	String email;
	boolean anticipation;
	
	public EmailValidationTest (String email,boolean anticipation) {
		this.email=email;
		this.anticipation=anticipation;
  }
	
      public static Collection emailFeed() {
    	  return Arrays.asList(new Object[][]{{"surajkumar7252@gmail.com",true},{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
    		  {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
    		  
    		  {"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},
    		  {"abc()*@gmail.com",false},{"abc@%*.com",false},{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},{"abc@abc@gmail.com",false},
    		  {"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}});
      }
  			
      @Test
  	public void emailShouldReturnBoolean_AsPerTheValidity() {
  		UserRegistration userReg=new UserRegistration();
  		boolean result=userReg.checkEmail(this.email);
  		Assert.assertEquals(this.anticipation, result);
      }						
  	}


