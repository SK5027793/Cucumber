package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase2Defination 
{	
	@After
	public void tearDown()
	{
		driver.close();
	}
	WebDriver driver;
	String url = "http://practice.automationtesting.in";
	
	@Given("^User Open the browser$")
	public void User_Open_the_browser()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@When("^User Enter the URL$")
	public void User_Enter_the_URL()
	{	
		driver.get(url);
	}
	
	@When("^User Click on Shop Menu$")
	public void User_Click_on_Shop_Menu()
	{
		driver.findElement(By.id("menu-item-40")).click();
		System.out.println("User cliked on shop menu");
	}
	
	@When("^User Now click on Home menu button$")
	public void User_Now_click_on_Home_menu_button()
	{
		driver.findElement(By.xpath("//*[@id='content']/nav/a")).click();
		System.out.println("User clicked on Home menu");
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
	
	@Then("^Validate the Home page has Three Arrivals only$")
	public void Validate_the_Home_page_has_Three_Arrivals_only()
	{
		List <WebElement> arraivals = driver.findElements(By.xpath("//ul[contains(@class, 'products')]"));
		int arrivalscount = arraivals.size();
		
		if(arrivalscount==3)
		{
			System.out.println("Working as expected, No. of arraivals are: "+ arrivalscount);
		}
		
		else
		{
			System.out.println("There is mismatch is count, arraivals are: "+arrivalscount);
		}
	}
	
	@Then("^User click the image in the Arrivals$")
	public void User_click_the_image_in_the_Arrivals()
	{
		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		System.out.println("User clicked on first arraival book");
	}
	
	@Then("^check page is navigated$")
	public void check_page_is_navigated()
	{
		if(url!=driver.getCurrentUrl())
		{
			System.out.println("User is navigated to "+driver.getCurrentUrl());
		}
		else
		{
			System.out.println("User is not navigating");
		}
	}
	
	@Then("^user can add that book into his basket$")
	public void user_can_add_that_book_into_his_basket()
	{
		if (driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
		{
			System.out.println("ADD TO BASKET button is displayed");
			if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			{
				System.out.println("ADD TO BASKET button is enabled");

				driver.findElement(By.xpath("//button[@type='submit']")).click();
				System.out.println("User is able to add book to basket");
			}
		}
		
	}
	
	@Then("^click on Description tab for the book you clicked on$")
	public void click_on_Description_tab_for_the_book_you_clicked_on()
	{
		driver.findElement(By.xpath("//ul[@class='tabs wc-tabs']//li[1]//a[1]")).click();
	}
	
	@Then("^there should be a description regarding that book the user clicked on$")
	public void there_should_be_a_description_regarding_that_book_the_user_clicked_on()
	{
		String expectedMSG = "The Selenium WebDriver Recipes book is a quick problem-solving "
				+ "guide to automated testing web applications with Selenium WebDriver. "
				+ "It contains hundreds of solutions to real-world problems, with clear explanations "
				+ "and ready-to-run test scripts you can use in your own projects.";
		
		String actualMSG= driver.findElement(By.xpath("//*[@id='tab-description']/p")).getText();
		
		if(expectedMSG.equals(actualMSG))
		{
			System.out.println("Matched descrition of book");
		}
		
		else
		{
			System.out.println("Mismatch in description");
		}
	}
	
	@Then("^click on Review tab for the book you clicked on$")
	public void click_on_Review_tab_for_the_book_you_clicked_on()
	{
		driver.findElement(By.xpath("//*[contains(text(), 'Reviews')][1]")).click();
	}
}
