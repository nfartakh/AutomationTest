package test.impl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonHelper {
	int timeOut = 30;
	DriverHandler driverHandler = new DriverHandler();

	public void clickXpathByJs(String xpath) {

		WebElement element = driverHandler.getDriver().findElement(By.xpath(xpath));
		((JavascriptExecutor) driverHandler.getDriver()).executeScript("arguments[0].click();", element);
	}

	public void clickById(String id) {
		waitElementToBeVisible(By.id(id)).click();
	}

	public void clickByXpath(String xpath) {
		waitElementToBeVisible(By.xpath(xpath)).click();
	}

	/**
	 * 
	 * @param by
	 * @return
	 */
	public WebElement waitElementToBeVisible(By by) {
		WebElement webElement =null;
		try {
			WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
			webElement = (WebElement) wait
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			System.out.println(" ==> The element "+ webElement+ " is not Visible after "+timeOut);
		}

		return webElement;
	}

	public WebElement waitElementToBeClickable(By by) {
		WebElement webElement =null;
		try {
			WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
			webElement = (WebElement) wait
					.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println(" ==> The element "+ webElement+ " is not Visible after "+timeOut);
		}

		return webElement;
	}
	
	
	public void wait(int timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
