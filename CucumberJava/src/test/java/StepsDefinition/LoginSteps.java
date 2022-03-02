package StepsDefinition;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	    System.out.println("Inside Step- User is in login page");
	    System.setProperty("webdriver.chrome.driver","C:/Users/nfartakh/eclipse-workspace/CucumberJava/src/main/resources/Drivers/chromedriver.exe");	    
		   
	    driver = new ChromeDriver();
	    driver.get("http://localhost:59979/");
	    driver.manage().window().maximize();
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("Inside Step- User enters username and password");
		WebElement UserTextbox = driver.findElement(By.id("username"));
		UserTextbox.sendKeys("Admin");
		Thread.sleep(2000);
	
		WebElement PWTextbox = driver.findElement(By.name("password"));
		PWTextbox.sendKeys("ALKmioksfghQesNmlIompfn");
		Thread.sleep(2000);
		//driver.findElement(By.name("submit")).click();		
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		
		System.out.println("Inside Step- User click on login button ");
		
		 WebElement LoginButton = driver.findElement(By.id("loginButton"));
		 LoginButton.click();
		 Thread.sleep(2000);
		 
	}
		
	

	@Then("the home page is shown")
	public void the_home_page_is_shown() throws InterruptedException {
		System.out.println("Inside Step- User is in the home page ");
		Thread.sleep(2000);
		//driver.close();
	}
	
}


