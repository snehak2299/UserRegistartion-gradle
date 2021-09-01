package UserRegistrationG;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailTest {
	private String emailId;
	private boolean expectedResult;
	private UserRegistration userRegistration;
	public EmailTest(String emailId,boolean expectedResult) {
		this.emailId=emailId;
		this.expectedResult=expectedResult;
		
	}
	
	
	
	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc@gmail.com",true},{"abc@.gmail.com",false},{"abc#12@.gmail.com",false},
			{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});		
	}
	
	@Test
	public void givenEmailID_ShouldReturnAsPerParamaterizedResult() {
		System.out.println("Is " + emailId +" valid: " + expectedResult);
		Assert.assertEquals(expectedResult, userRegistration.validateEmailId(emailId));
	}
}
