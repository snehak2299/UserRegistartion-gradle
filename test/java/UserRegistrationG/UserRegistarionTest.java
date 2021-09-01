package UserRegistrationG;
import org.junit.Test;
import org.junit.Assert;

public class UserRegistarionTest {
	@Test
	public void givenFirstName_WhenProper_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Sneha");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Sn");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpecialChars_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Sneha@");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithoutCaps_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("snehs");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenCapsInBtw_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("snehA");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenEmptyName_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumber_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateFirstName("Sneha2a");
		Assert.assertEquals(false, result);
	}
	
	//Test Cases for LastName.
	@Test
	public void givenLastName_WhenProper_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Kanase");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenShort_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Ka");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Kanase@");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithoutCaps_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("kanase");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenCapsInBetween_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("kaNase");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenEmptyName_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithNumber_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateLastName("Kana2se");
		Assert.assertEquals(false, result);
	}
	
	//Test Case for Email-ID
	@Test
	public void givenEmailID_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumber_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha2299@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmail_WhenEmail_NumberAndSpChar_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("snehakanase2e@gmail.com");
		Assert.assertEquals(true, result);
		
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumberAndSpCharAndTwoTld_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha-2299@gmail.com");
		Assert.assertEquals(true, result);
		
	}
	
	@Test
	public void givenEmailID_WhenWithMultipleTld_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha.gn.hn@gmail.com.in.au");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithNoSymbol_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenTldStartsWithDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha@.com.in");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailStartsWithDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId(".sneha.@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithNotValidTld_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha@com.k");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithBrackets_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha()!@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithTwoDots_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha..2002@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithLastCharDot_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha.@com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenWithTwoSymbol_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateEmailId("sneha@1999@com.m");
		Assert.assertEquals(false, result);
	}
	
	//Test Case for Mobile number
	@Test
	public void givenMobileNumber_WhenProper_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 9892789999");
		Assert.assertEquals(true, result);
		
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoSpace_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("919892789999");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenLessThanTenDigits_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 989278999");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoCountryCode_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("9892789999");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenMoreThanTenDigits_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validateMobileNumber("91 98927899999");
		Assert.assertEquals(false, result);
	}
	
	//Test case for Password
	@Test
	public void givenPassword_WhenProper_ReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Sneha@02");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoCaps_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("sneha@102");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoSymbol_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Sneha18");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithLessThanEightLength_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Sne@18");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenWithNoNumber_ReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("Sneha@");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenEmptyPassword_False() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.validatePassword("");
		Assert.assertEquals(false, result);
	}
}
