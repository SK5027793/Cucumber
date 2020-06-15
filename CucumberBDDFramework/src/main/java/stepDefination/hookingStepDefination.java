package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hookingStepDefination
{  
	//@Before()
	public void setUp()
	{
		System.out.println("Launch FireFox browser");
		System.out.println("Launch FBO url");
	}
	
	//@After()
	public void tearDown()
	{
		System.out.println("Close the browser");
	}
	
   @Given("^user selects a invoice for payment$")
   public void select_invoice() 
   {
	   System.out.println("User selected invoice to perform payment");
   }

   
   @When("^user enters PayPal credentails$")
   public void enter_credentials()
   {
	   System.out.println("User enters credentials and proceed with PayPal payment");
   }
   
   @Then("^user clicks on pay button$")
   public void click()
   {
	   System.out.println("User clicks on Pay button");
   }
   
   @Then("^user performed PayPal payment successfully$")
   public void payment_done()
   {
	   System.out.println("Payment Confirmation number is generated");
   }
}
