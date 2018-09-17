package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver ;
	
@Given("^open chrome and lauch the application$")
public void open_chrome_and_lauch_the_application() throws Throwable {
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.fundsindia.com/");
}

@When("^I Enter Valid username and password$")
public void I_Enter_Valid_username_and_password() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='signIn']/button")).click();
//	driver.findElement(By.xpath(".//*[@id='userMailId']")).sendKeys("mercury");
//	driver.findElement(By.xpath(".//*[@id='userPassword']")).sendKeys("mercury");
}

@Then("^User should be able to login succesfully$")
public void User_should_be_able_to_login_succesfully() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='UserSignInForm']/button")).click();
	driver.quit();
}
	
}
