package UserRegistrationGR;
import java.util.regex.Pattern;



public class UserRegistration {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
	private static final String EMAIL_PATTERN = "^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
	private static final String MOBILE_NUMBER_PATTERN = "^[0-9-]{1,}\\s[0-9]{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
	
	
	public boolean validateFirstName(String name) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(name).matches();
	}
	
	public boolean validateLastName(String name) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(name).matches();
	}
	
	public boolean validateEmailId(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matcher(email).matches();
	}
	
	public boolean validateMobileNumber(String number) {
		Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
		return pattern.matcher(number).matches();
	}
	
	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(password).matches();
	}
	public String validateFirstName1(String msg) throws ValidateException{
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		try {
			if(msg.length()<=0) {
				throw new ValidateException("firstName cannot be empty");
			}
			if(pattern.matcher(msg).matches()) {
				return "valid firstname";
			}
			return "invalid firstname";
		}catch(NullPointerException e) {
			throw new ValidateException("firstName cannot be null");
		}
	}
	
	//lastName
		public String validateLastName1(String msg) throws ValidateException{
			Pattern pattern=Pattern.compile(NAME_PATTERN);
			try {
				if(msg.length()<=0) {
					throw new ValidateException("lastName cannot be empty");
				}
				if(pattern.matcher(msg).matches()) {
					return "valid lastname";
				}
				return "invalid lastname";
			}catch(NullPointerException e) {
				throw new ValidateException("lastName cannot be null");
			}
		}
		
		//Email
				public String validateEmail1(String msg) throws ValidateException{
					Pattern pattern=Pattern.compile(EMAIL_PATTERN);
					try {
						if(msg.length()<=0) {
							throw new ValidateException("Email cannot be empty");
						}
						if(pattern.matcher(msg).matches()) {
							return "valid Email";
						}
						return "invalid Email";
					}catch(NullPointerException e) {
						throw new ValidateException("Email cannot be null");
					}
				}
				
				//Mobile
				public String validateMobile1(String msg) throws ValidateException{
					Pattern pattern=Pattern.compile(MOBILE_NUMBER_PATTERN);
					try {
						if(msg.length()<=0) {
							throw new ValidateException("Mobile cannot be empty");
						}
						if(pattern.matcher(msg).matches()) {
							return "valid Mobile";
						}
						return "invalid Mobile";
					}catch(NullPointerException e) {
						throw new ValidateException("Mobile cannot be null");
					}
				}
	
}
