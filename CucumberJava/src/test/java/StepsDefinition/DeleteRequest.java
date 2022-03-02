
package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class DeleteRequest {
	int timeOut = 30000;
	DriverHandler driverHandler = new DriverHandler();
	CommonHelper commonHelper = new CommonHelper();

	@When("the user click on button Search")
	public void the_user_click_on_button_Search() throws InterruptedException {
		System.out.println("The user click on button Search");
		Thread.sleep(2000);
		WebElement btnSearch = driverHandler.getDriver().findElement(By.id("btnSearch"));
		btnSearch.click();

	}

	@And("select request from the grid")
	public void select_request_from_the_grid() throws InterruptedException {
		Thread.sleep(5000);
		WebElement SelectRq = driverHandler.getDriver().findElement(By.xpath("//*[contains(text(), 'DIGITTM-010018-6000176696-REQ-01')]"));
		SelectRq.click();
		Thread.sleep(5000);
	}

	@And("clicks on button Remove")
	public void clicks_on_button_Remove() {
		//commonHelper.clickById("DeleteRq", timeOut);

	}

	@And("clicks on yes in the sweet alert appeared")
	public void clicks_on_yes_in_the_sweet_alert_appeared() throws InterruptedException {
		commonHelper.clickXpathByJs("//*[contains(text(), 'Yes, delete it!')]");
	}

	@Then("The request is deleted")
	public void the_request_is_deleted() {

		System.out.println("Request is deleted");
	}

}
