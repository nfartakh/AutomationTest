package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateSCfromBR {

	DriverHandler driver = new DriverHandler();

	CommonHelper commonHelper = new CommonHelper();

	@When("select request from the grid which have Status PSA or PIP and SC no created")
	public void select_request_from_the_grid_which_have_status_psa_or_pip_and_sc_no_created()
			throws InterruptedException {
		WebElement Filter = driver.getDriver().findElement(By.id("filter"));
		Filter.sendKeys("Test28022021_PSA");

		JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);

		WebElement select = driver.getDriver().findElement(By.xpath("//*[contains(text(), 'Test28022021_PSA')]"));
		select.click();
		Thread.sleep(5000);

		/*
		 * WebElement scrollright = driver.getDriver().findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]"
		 * )); js.executeScript("arguments[0].scrollIntoView()", scrollright);
		 * 
		 * 
		 * WebElement sccreated =
		 * driver.getDriver().findElement(By.xpath("//*[contains(text(), 'SC created')]"
		 * )); sccreated.click();
		 * 
		 * Thread.sleep(2000);
		 */
		// WebElement SelectRq =
		// driver.getDriver().findElement(By.xpath("//*[contains(text(),'DIGITTM-013227-DIGITTM-011250-MOD-01-6000176696-REQ-01')]"));
		// SelectRq.click();
		// Thread.sleep(1000);

	}

	@And("clicks on button Edit")
	public void clicks_on_button_edit() {
		commonHelper.waitElementToBeClickable(By.id("EditBR")).click();
	}

	@And("access to tab Specific contract")
	public void access_to_tab_specific_contract() throws InterruptedException {

		((JavascriptExecutor)driver.getDriver()).executeScript(
				  "arguments[0].click();", commonHelper.waitElementToBeClickable(By.id("step5")));
	}

	@And("clicks on button Create SC")
	public void clicks_on_button_create_sc() {
		commonHelper.waitElementToBeClickable(By.id("CreateSC")).click();
	}

	
	
	  @And("clicks on Yes, and proceed") public void clicks_on_yes_and_proceed() {
	  ((JavascriptExecutor)driver.getDriver()).executeScript(
			  "arguments[0].click();", commonHelper.waitElementToBeClickable(By.xpath("//*[contains(text(), 'Yes, and proceed!')]")));
}
	  
	  @And("add an OERP project code") public void add_an_OERP_project_code() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement OERPcode =  driver.getDriver().findElement(By.name("OERPProjectCode"));
	  OERPcode.sendKeys("Test22022022"); 
	  Thread.sleep(2000);
	  WebElement ButtonAdd =driver.getDriver().findElement(By.id("ButtonAddOERP")); 
	  ButtonAdd.click();
	  Thread.sleep(2000);
	  WebElement SaveOERP = driver.getDriver().findElement(By.id("SaveOERPcode"));
	  SaveOERP.click();
	  }
	 
	  @Then("the SC is created") public void the_sc_is_created() {
	  
	  }
	 
}

//commonHelper.waitElementToBeVisible(By.name("OERPProjectCode")).sendKeys("Test22022022");

//commonHelper.waitElementToBeClickable(By.id("ButtonAddOERP")).click();

//commonHelper.waitElementToBeClickable(By.id("SaveOERPcode")).click();

