package teqtestCases;

import org.testng.annotations.Test;

import teqPages.NewRequestPage;


public class NewRequestTest extends TeqBase{
	NewRequestPage reg=new NewRequestPage();
	@Test(priority=0)
	public void verifyloginBtn() throws Exception {
		reg.login();
		
	}
	
	@Test(priority=1,dataProvider = "Signup", dataProviderClass = teqTestData.TeqTestDataProvider.class)
	public void verifyRegister(String fname1,String lname1,String number1,String email1,String password1) throws Exception {
		
		int min = 5;
	    int max = 500;
	   
	      
	    //Generate random int value from 50 to 100 
	    System.out.println("Random value in int from "+min+" to "+max+ ":");
	    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	String s=Integer.toString(random_int);
		reg.Register(fname1+s,lname1,number1,email1+s+"@yopmail.com",password1+s);
		logger.info("Successfull Test");
	}
	
}
