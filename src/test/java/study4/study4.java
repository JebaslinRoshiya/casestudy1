package study4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class study4 {
	static WebDriver driver;
	@Given("Open the TestMe app Homepage")
	public void open_the_TestMe_app_Homepage() {
		 System.setProperty("webdriver.chrome.driver","C:\\\\arabi\\\\drivers\\\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://10.232.237.143:443/TestMeApp/");
		    driver.manage().window().maximize();
	}

	@When("Click the SignIn")
	public void click_the_SignIn() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("User enters the username {string}")
	public void user_enters_the_username(String x) {
		driver.findElement(By.name("userName")).sendKeys(x);
	}

	@Then("User enters the password {string}")
	public void user_enters_the_password(String y) {
		driver.findElement(By.name("password")).sendKeys(y);
	}

	@Then("User clicks login")
	public void user_clicks_login() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("User enter the {string} in the field")
	public void user_enter_the_in_the_field(String z) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(z);
	}

	@Then("User enters the find details")
	public void user_enters_the_find_details() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("try to proceed payment without adding any items in the cart")
	public void try_to_proceed_payment_without_adding_any_items_in_the_cart() {
		
		}
		//*[@id="header"]/div[1]/div/div/div[2]/div/a[2]
	

	@Then("TestMe App doesn't display the cart icon")
	public void testme_App_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
