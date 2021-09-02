package UserRegistrationGR;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class userRegistrationExcep {
	@Test
	public void givenFirstName_whenProper_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Sneha02");
		}catch(ValidateException e) {
			assertEquals("valid firstName ",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenNull_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1(null);
		}catch(ValidateException e) {
			assertEquals("firstName cannot be null",e.getMessage());
			
		}
	}
	
	@Test
	public void givenFirstName_whenEmpty_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("");
		}catch(ValidateException e) {
			assertEquals("firstName cannot be empty",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenToShort_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("sneh");
		}catch(ValidateException e) {
			assertEquals("firstName cannot be empty",e.getMessage());
			
		}
	}
	
	@Test
	public void givenFirstName_whenSpclChar_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Sneha@");
		}catch(ValidateException e) {
			assertEquals("invalid firstName ",e.getMessage());
			
		}
	}
	@Test
	public void givenFirstName_whenNumber_shouldThrowException() {
		UserRegistration validater=new UserRegistration();
		String custom;
		try {
			custom=validater.validateFirstName1("Sneha02");
		}catch(ValidateException e) {
			assertEquals("invalid firstName ",e.getMessage());
			
		}
	}
	
	
	//last name
	
		@Test
		public void givenLastName_whenProper_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Kanase");
			}catch(ValidateException e) {
				assertEquals("valid lastName ",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenNull_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1(null);
			}catch(ValidateException e) {
				assertEquals("lastName cannot be null",e.getMessage());
				
			}
		}
		
		@Test
		public void givenLastName_whenEmpty_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("");
			}catch(ValidateException e) {
				assertEquals("lastName cannot be empty",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenToShort_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("ka");
			}catch(ValidateException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		
		@Test
		public void givenLastName_whenSpclChar_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Kanase@");
			}catch(ValidateException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		@Test
		public void givenLastName_whenNumber_shouldThrowException() {
			UserRegistration validater=new UserRegistration();
			String custom;
			try {
				custom=validater.validateLastName1("Kanase02");
			}catch(ValidateException e) {
				assertEquals("invalid lastname",e.getMessage());
				
			}
		}
		//mobile
		
			@Test
			public void givenMobile_whenProper_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 9890989090");
				}catch(ValidateException e) {
					assertEquals("valid Mobile ",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenNull_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1(null);
				}catch(ValidateException e) {
					assertEquals("Mobile cannot be null",e.getMessage());
					
				}
			}
			
			@Test
			public void givenMobile_whenEmpty_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("");
				}catch(ValidateException e) {
					assertEquals("Mobile cannot be empty",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenToShort_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 9577");
				}catch(ValidateException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
			
			@Test
			public void givenMobile_whenSpclChar_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 9@801");
				}catch(ValidateException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
			@Test
			public void givenMobile_whenCharacter_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateMobile1("+91 901i246");
				}catch(ValidateException e) {
					assertEquals("invalid Mobile",e.getMessage());
					
				}
			}
		//Email
		
			@Test
			public void givenEmail_whenProper_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc.xyz@bridgelabz.co.in");
				}catch(ValidateException e) {
					assertEquals("valid Email ",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenNull_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1(null);
				}catch(ValidateException e) {
					assertEquals("Email cannot be null",e.getMessage());
					
				}
			}
			
			@Test
			public void givenEmail_whenEmpty_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("");
				}catch(ValidateException e) {
					assertEquals("Email cannot be empty",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenToShort_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc");
				}catch(ValidateException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}
			
			@Test
			public void givenEmail_whenNOSpclChar_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("abc@gmail.com.co");
				}catch(ValidateException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}
			@Test
			public void givenEmail_whenNumber_shouldThrowException() {
				UserRegistration validater=new UserRegistration();
				String custom;
				try {
					custom=validater.validateEmail1("Kanase31");
				}catch(ValidateException e) {
					assertEquals("invalid Email",e.getMessage());
					
				}
			}

}
