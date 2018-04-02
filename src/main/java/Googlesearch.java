import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Googlesearch {
	
	WebDriver driver;
	WebElement fn1, click1;

	@Given("^User search the googlepage$")
	public void user_search_the_googlepage()  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vadivelkb\\eclipse-workspace\\project class\\Projects\\lib\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=S1a7WozqHYLmugT5vp7gCA");
	}

	@When("^User the enter the \"([^\"]*)\"$")
	public void user_the_enter_the(String arg1)  {
		
		fn1= driver.findElement(By.id("lst-ib"));
		fn1.sendKeys(Examples);
	
	click1 = driver.findElement(By.id("lst-ib"));
	click1.click();

	}

	@Then("^User validiate the searchname$")
	public void user_validiate_the_searchname()  {

		Assert.assertEquals("Examples", fn1.findElement(By.xpath("//span[text()='TestNG']")).getText());
		Assert.assertEquals("Examples", fn1.findElement(By.xpath("//span[text()='Selenium']")).getText());
		Assert.assertEquals("Examples", fn1.findElement(By.xpath("//span[text()='Cucumber']")).getText());
	}


}
