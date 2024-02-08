package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest{
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	
  @Test
  public void testMethodForEnteringCredentials() {
	  
	  logger.info("singin to LoginPage");
	  homePage.signInButton();
	  logger.info("verify if Login Text is present");
	  loginPage.verifyIfLoginPageIsLoaded();
	  logger.info("Enter valid credentials");
	  loginPage.enterCredentials();
	  logger.info("verify if Login successful");
	  
	  
  }
}
