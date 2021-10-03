package LegalCucumberFramework.StepFile;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class entity3EStepFile {
	
	WebDriver driver;
	
	@Before 
	public void Setup() throws Throwable {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();	
		this.driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver =null;
	}
@Given("User can access 3E portal")
public void user_can_access_3E_portal() throws InterruptedException {
	this.driver.get("http://3evm/TE_3E_DEV/web/ui/dashboard");
	this.driver.manage().window().maximize();
	Thread.sleep(1000);

	System.out.println("test");
}

@When("User is able to enter entity panel")
public void user_is_able_to_enter_entity_panel() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("test");
}

@Then("seach for a valid entity")
public void seach_for_a_valid_entity() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("test");
}

}
