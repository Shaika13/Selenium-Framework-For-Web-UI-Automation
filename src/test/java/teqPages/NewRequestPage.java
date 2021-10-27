package teqPages;
import teqtestCases.TeqBase;

import java.util.Set;

import org.openqa.selenium.By;

public class NewRequestPage extends TeqBase{

	public By loginBtn=By.xpath("//a[contains(text(),\"Login\")]");
	public By RegBtn=By.xpath("//a[contains(text(),\"Register\")]");
	public By fname=By.id("inputFirstName");
	public By lname=By.id("inputLastName");
	public By email=By.id("inputEmail");
	public By number=By.id("inputPhone");
	public By address=By.id("inputAddress1");
	public By City=By.id("inputCity");
	public By state=By.id("stateinput");
	public By postcode=By.id("inputPostcode");
	public By Password=By.id("inputNewPassword1");
	public By ConfirmPassword=By.id("inputNewPassword2");
	public By CaptchCheckbox=By.xpath("//span[@role=\"checkbox\"]");
	public By Register=By.xpath("//input[@value=\"Register\"]");
	public By verification=By.xpath("//h1[contains(text(),\"Welcome\")]");
	
	String parent;
	public void login() throws Exception {
		
		parent=driver.getWindowHandle();
		clickElement(loginBtn);
		logger.info("Login Button pressed");
		
	}
	
	public void Register(String fname1,String lname1,String number1,String email1,String password1) throws Exception {
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String child:allWindows)
		{
			
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
		}
		clickElement(RegBtn);
		verifyElementAndDataEntry(driver,fname,fname1);
		verifyElementAndDataEntry(driver,lname,lname1);
		verifyElementAndDataEntry(driver,email,email1);
		verifyElementAndDataEntry(driver,number,number1);
		verifyElementAndDataEntry(driver,address,"Oslo");
		verifyElementAndDataEntry(driver,City,"Jaren");
		verifyElementAndDataEntry(driver,state,"Norway");
		verifyElementAndDataEntry(driver,postcode,"2001");
		verifyElementAndDataEntry(driver,Password,password1);
		verifyElementAndDataEntry(driver,ConfirmPassword,password1);
		logger.info("Entered values successfully");
		//clickElement(CaptchCheckbox);
		//clickElement(Register);
		//single_verification(verification,"Registered Succesfully","verifyRegister");
		
		
	}
}
