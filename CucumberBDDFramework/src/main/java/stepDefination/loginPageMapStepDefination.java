package stepDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageMapStepDefination 
{

	 WebDriver driver;
	  @Given("^map user is already on loginpage$")
	  public void user_on_loginPage() 
	  {  
		  System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://github.com/login");
		  
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }   
	  
	 @When("^map user is on loginpage$")
	  public void url_of_loginPage()
	  {
		  String expectedurl = "https://github.com/login";
		  String actualurl= driver.getCurrentUrl();
		  System.out.println(actualurl);
		  if(actualurl.equals(expectedurl))
		  {
			  System.out.println("URL matched: Working as expected");
		  }
		  else
		  {
			  System.out.println("Difference in URL: Failed");
		  }
	  }
	  
	 @Then("^map user enters username and password$")
	 public void user_enters_username(DataTable credentials)
	 {   
		 for (Map<String, String> data: credentials.asMaps(String.class, String.class))
		 {
		 driver.findElement(By.xpath("//input[@name='login']")).sendKeys(data.get("username"));
	     driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 }
	 }
	 
	 @Then("^map user clicks on Sign in button$")
	 public void click_signin_button()
	 {
		 driver.findElement(By.name("commit")).click();
	 }
	 
	 @Then("^map user navigates to homepage$")
	 public void user_navigates_homepage()
	 {
		 String actualTitle =driver.getTitle(); 
		 System.out.println("Actual title is "+actualTitle);
		 String expectedTitle = "Sign in to GitHub · GitHub";
		 if(actualTitle.equals(expectedTitle))
		 {
			 System.out.println("Title matched: Working as expected");
		 }
		 else
		 {
			 System.out.println("Difference in title: Failed");
		 }
	 }
	 
	 @Then("^map close the browser$")
	 public void close_browser() 
	 {
		 driver.close();
		 System.out.println("Browser closed");
	 }

}
