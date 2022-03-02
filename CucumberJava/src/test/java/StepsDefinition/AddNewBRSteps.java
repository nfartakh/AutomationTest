package StepsDefinition;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.impl.pages.DriverHandler;

public class AddNewBRSteps {
	
	DriverHandler driver= new DriverHandler();
	@Given("the user is in the Business Request home page")
	public void the_user_is_in_the_Business_Request_home_page() throws InterruptedException {
	    System.out.println("User is in the Business Request home page");
	    System.out.println("Inside Step- User is in login page");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/Users/nfartakh/eclipse-workspace/CucumberJava/src/main/resources/Drivers/chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */
	    driver.openUrl("http://localhost:59979/BusinessRequest/Index");
	    WebElement UserTextbox = driver.getDriver().findElement(By.id("username"));
		UserTextbox.sendKeys("Admin");
		Thread.sleep(2000);
	
		WebElement PWTextbox = driver.getDriver().findElement(By.name("password"));
		PWTextbox.sendKeys("ALKmioksfghQesNmlIompfn");
		Thread.sleep(2000);
		WebElement LoginButton = driver.getDriver().findElement(By.id("loginButton"));
		 LoginButton.click();
		 Thread.sleep(2000);
	
	}

	@When("the user click on the button New Business Request")
	public void the_user_click_on_the_button_New_Business_Request() throws InterruptedException {
	    System.out.println("User click on button New Business Request");
	    WebElement AddButton = driver.getDriver().findElement(By.id("add"));
		 AddButton.click();
		 Thread.sleep(2000);
	}

	@And("enters Request number , choose FWC , and Department, choose status OIP, and service type TM")
	public void enters_Request_number_choose_FWC_and_Department_choose_status_OIP_and_service_type_TM() throws InterruptedException {
	    System.out.println("User fill required fields of the first tab - General Information ");
	    //Fill Request NuMBER
	    WebElement ReqNumber = driver.getDriver().findElement(By.name("ReqNumber"));
	    ReqNumber.sendKeys("AutomationTest1");
	    // Choose FWC 
	    Select FWC = new Select(driver.getDriver().findElement(By.name("typeofct")));
	    FWC.selectByVisibleText("CASIS Lot 1");
	    Thread.sleep(5000);
	    
	    //Choose Status "OIP"
	    Select Status = new Select(driver.getDriver().findElement(By.name("status")));
	    Status.selectByVisibleText("Order in Progress (OiP)");
	 // Choose Department 
	    WebElement Department =driver.getDriver().findElement(By.name("DGdepartment"));
	    Department.clear();
	    Department.sendKeys("AGRI");
	    Thread.sleep(2000);
	    //Choose Service type "TM"
	    Select Servicetype = new Select(driver.getDriver().findElement(By.name("typebr")));
	    Servicetype.selectByVisibleText("TM");
	    WebElement ButtonBasicC = driver.getDriver().findElement(By.id("step3"));
	    ButtonBasicC.click();
	       	    
	}


	@When("the user clicks on button Basic characteristics")
	public void the_user_clicks_on_button_Basic_characteristics() {
	    System.out.println("User access to tab -Basic characteristics-");
	    WebElement ButtonBasicC = driver.getDriver().findElement(By.id("step3"));
	    ButtonBasicC.click();
	   
}

	@And("choose the Place of delivery and Company")
	public void choose_the_Place_of_delivery_and_Company() {
	    System.out.println("User choose Place of delivery and Company");
	    //Choose Place of delivery
	    Select PlaceofD = new Select(driver.getDriver().findElement(By.name("placedelivery")));
	    PlaceofD.selectByVisibleText("BRU");
	    //Choose Company 
	    Select Company = new Select(driver.getDriver().findElement(By.name("Company")));
	    Company.selectByVisibleText("everis EBEL");
	    
	}

	@When("the user click on button New Profile")
	public void the_user_click_on_button_New_Profile() throws InterruptedException {
	    System.out.println("User click on button -New Profile-");
	    WebElement btnNewProfile = driver.getDriver().findElement(By.id("btnNewProfile"));
	    btnNewProfile.click();	    
	    Thread.sleep(4000);

	}

	@And("Choose Profile and Level and on site")
	public void choose_Profile_and_Level_and_on_site() throws InterruptedException {
		System.out.println("User choose Profile and Level and on/off site");
		Select Profile = new Select(driver.getDriver().findElement(By.id("BRprofile")));
	    Profile.selectByVisibleText("AA");
	    Select Level = new Select(driver.getDriver().findElement(By.id("BRLevel")));
	    Level.selectByVisibleText("Junior");
	    Select OnSite = new Select(driver.getDriver().findElement(By.name("OnSite")));
	    OnSite.selectByVisibleText("On site");
	    Thread.sleep(4000);
	}

	@And("fill Number of days and Other Expertise required")
	public void fill_Number_of_days_and_Other_Expertise_required() throws InterruptedException {
		WebElement Ndays = driver.getDriver().findElement(By.id("ndaysprofile"));
		Ndays.sendKeys("20");
		WebElement OtherExpertise = driver.getDriver().findElement(By.name("Other_Expertise_required"));
		OtherExpertise.sendKeys("Java");
		Thread.sleep(4000);
	    
	}

	@And("click on Save")
	public void click_on_Save() throws InterruptedException {
		WebElement SaveBRProfile = driver.getDriver().findElement(By.id("SaveBRProfile"));
		SaveBRProfile.click();
		
		
	}

	@And("click on button Save of the Business Request")
	public void click_on_button_Save_of_the_Business_Request() throws InterruptedException {
		Thread.sleep(4000);
		WebElement SaveBR = driver.getDriver().findElement(By.id("SaveBR"));
		SaveBR.click();
	  
	}

	
	  @Then("the request is saved") public void the_request_is_saved() {
	  System.out.println("Request is saved");
	  
	  }
	 


	
	
	

}
