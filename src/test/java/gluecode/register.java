package gluecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.When;

public class register {
	WebDriver driver;
	@When("open chrome browser")
	public void open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\ChromeDriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("enter username")
	public void enter_username() {
		driver.findElement(By.name("userName")).sendKeys("gokul69");
	}

	@When("enter first name")
	public void enter_first_name() {
		driver.findElement(By.name("firstName")).sendKeys("gokul");
	}

	@When("enter last name")
	public void enter_last_name() {
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("prasath");
	}

	@When("enter password")
	public void enter_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("gokul@123");
	}

	@When("enter confirm password")
	public void enter_confirm_password() {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys("gokul@123");
	}

	@When("gender")
	public void gender() {
		List <WebElement> allRadio=driver.findElements(By.name("gender"));
		  System.out.println(allRadio.size());
		  allRadio.get(1).click();
		  System.out.println(allRadio.get(1).getAttribute("selected"));  
	}

	@When("provide mailid")
	public void provide_mailid() {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys("anna@gmail.com");
	}

	@When("mobile number")
	public void mobile_number() {
		 driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys("1234567890");
	}

	@When("give date of birth")
	public void give_date_of_birth() {
		 driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("13/03/1998");
	}

	@When("give address")
	public void give_address() {
		 driver.findElement(By.xpath("//*[@id='address']")).sendKeys("ganesh nagar");
	}

	@When("choose security question")
	public void choose_security_question() {

		 WebElement dropdown=driver.findElement(By.name("securityQuestion"));    
		 Select s=new Select(dropdown);                           
			s.selectByIndex(1);	
	}

	@When("provide ans to selected security question")
	public void provide_ans_to_selected_security_question() {
		driver.findElement(By.xpath("//*[@id='answer']")).sendKeys("blue");
	}

	@When("click register and close")
	public void click_register_and_close() {
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
    driver.close();
	}

}
