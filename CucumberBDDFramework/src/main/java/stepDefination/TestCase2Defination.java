package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase2Defination 
{	WebDriver driver;
	@Given("^User Open the browser$")
	public void User_Open_the_browser()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("^User Enter the URL$")
	public void User_Enter_the_URL()
	{
		driver.get("http://practice.automationtesting.in/");
	}
	
	@When("^User Click on Shop Menu$")
	public void User_Click_on_Shop_Menu()
	{
		driver.findElement(By.id("menu-item-40")).click();
	}
	
	@When("^User Now click on Home menu button$")
	public void User_Now_click_on_Home_menu_button()
	{
		driver.findElement(By.xpath("//*[@id='content']/nav/a")).click();
	}
	
	@Then("^Validate The Home page must contains only three sliders$")
	public void Validate_The_Home_page_must_contains_only_three_sliders()
	{
		String sliderxpath= "//*[@id=\"n2-ss-6\"]//div[contains(@class, 'n2-ss-slider-')]";
	    List <WebElement> sliderelements = driver.findElements(By.xpath(sliderxpath));
		int count= sliderelements.size();
		if(count==3)
		{
			System.out.println("Working as expcted, No. of sliders are : "+count);
		}
		else
		{
			System.out.println("Count mismatch, there are : "+count+ " sliders");
		}
	}
	//slider class 1: //*[@id="n2-ss-6-arrow-previous"]/img/parent::div[1]/parent::div[1]/descendant::div[1]
	//count of slider: //*[@id="n2-ss-6"]//div[contains(@class, 'n2-ss-slider-')];
}
