package StepsDefinition;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.CucumberOptions;
import test.impl.pages.DriverHandler;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
// plugin = {"pretty","rerun:target/rerun.txt"},

features = {"src/test/resources/Features/CreateSCfromBR.feature"
				
},
//plugin = {"pretty", "html:target/cucumber-htmlreport",
//"json-pretty:target/cucumber-report.json"},
glue="StepsDefinition"
)

public class cucumberRunner {
	static DriverHandler driver = new DriverHandler();

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver.initiatDriver();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.closeDriver();
	}

	@Before
	public void setUp() throws Exception {
		//driver.initiatDriver();
	}

	@After
	public void tearDown() throws Exception {
		//driver.closeDriver();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
}
