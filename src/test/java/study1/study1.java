package study1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class study1 {
	 WebDriver driver;
	@Given("Open the TestMe App Homepage")
	public void open_the_TestMe_App_Homepage() {
	  
	   System.setProperty("webdriver.chrome.driver","C:\\arabi\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
	   
	}

	@Given("click on SignUp")
	public void click_on_SignUp() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String x) {
		driver.findElement(By.name("userName")).sendKeys(x);
		driver.findElement(By.name("userName")).sendKeys(Keys.ENTER);
	}

	@When("User enters the firstname {string}")
	public void user_enters_the_firstname(String y) {
		driver.findElement(By.name("firstName")).sendKeys(y);
	   
	}

	@When("User enters the lastname {string}")
	public void user_enters_the_lastname(String z) {
		driver.findElement(By.name("lastName")).sendKeys(z);
	}

	@Then("User enters the password {string}")
	public void user_enters_the_password(String a) {
		driver.findElement(By.name("password")).sendKeys(a);
	   
	}

	@Then("User enters the confirmpassword {string}")
	public void user_enters_the_confirmpassword(String b) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(b);
	   
	}

	@Then("User clicks the gender")
	public void user_clicks_the_gender() {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("User enters the email {string}")
	public void user_enters_the_email(String c) {
		driver.findElement(By.name("emailAddress")).sendKeys(c);
	}

	@Then("User enters the mobileno {string}")
	public void user_enters_the_mobileno(String d) {
		 driver.findElement(By.name("mobileNumber")).sendKeys(d);
	}

	@Then("User enters the DOB")
	public void user_enters_the_DOB() {
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]/option[3]")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]/option[49]")).click();
		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a")).click();
	   
	}

	@Then("User enters the address {string}")
	public void user_enters_the_address(String e) {
		driver.findElement(By.id("address")).sendKeys(e);
	    
	}

	@Then("User selects the secques")
	public void user_selects_the_secques() {
		 WebElement security=driver.findElement(By.name("securityQuestion"));
		  Select selques=new Select(security);
		  selques.selectByVisibleText("What is your Birth Place?");
		  driver.findElement(By.name("answer")).sendKeys("Nazreth");
	   
	}

	@Then("User enters the answer {string}")
	public void user_enters_the_answer(String f) {
		driver.findElement(By.name("answer")).sendKeys(f);
	}

	@Then("User clicks Register")
	public void user_clicks_Register() {
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
}
