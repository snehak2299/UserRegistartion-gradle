package UserRegistrationGR;

public class UserRegistrationLambda {
	public static void main(String[] args) {
		IRegistration firstName = (pattern) -> {
			String check = "^[A-Z][a-z]{3,}";
			if(pattern.matches(check))
				return true;
			else
				return false;
		};
	
		IRegistration lastName = (pattern) -> {
			String check = "^[A-Z][a-z]{3,}";
			if(pattern.matches(check))
				return true;
			else
				return false;
		};
	
		IRegistration email = (pattern) -> {
			String check = "^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
			if(pattern.matches(check))
				return true;
			else
				return false;
		};
		
		IRegistration phoneNumber = (pattern) -> {
			String check = "^[0-9-]{1,}\\s[0-9]{10}$";
			if(pattern.matches(check))
				return true;
			else
				return false;
		};
		
		IRegistration password = (pattern) -> {
			String check = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
			if(pattern.matches(check))
				return true;
			else
				return false;
		};
			
				
			
		// for first name
		System.out.println("Validation for first name sneha is: "+firstName.validate("sneha"));
		System.out.println("Validation for first name Sneha is: "+firstName.validate("Sneha"));
		
		//for last name
		System.out.println("validation for last name kanase is: "+lastName.validate("kanase"));
		System.out.println("validation for last name Kanase is "+lastName.validate("Kanase"));
		
		//for email
		System.out.println("validation for email abc.xyz@bridgelabz.co.in is: "+email.validate("abc.xyz@bridgelabz.co.in"));
		System.out.println("validation for email abc@gmail.com.co is: "+email.validate("abc@gmail.com.co"));
		
		//for phone number
		System.out.println("validation for phone number 91 9892789987 is: "+phoneNumber.validate("91 9892789987"));
		System.out.println("validation for phone number 9892789987 is: "+phoneNumber.validate("9892789987"));
		
		//for password
		System.out.println("validation for password Sneha@12399 is: "+ password.validate("Sneha@12399"));
		System.out.println("validation for password sneha@9 is: "+ password.validate("sneha@9"));
	}
}
