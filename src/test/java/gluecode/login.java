package gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class login{
	WebDriver driver;
	@When("open browser")
	public void open_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		Thread.sleep(2000);
	}

	@When("enter valid user name {string}")
	public void enter_valid_user_name(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    
	}

	@When("enter valid password {string}")
	public void enter_valid_password(String string) {
	   driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("click on sig in button")
	public void click_on_sig_in_button() {
	   driver.findElement(By.name("Login")).click();
	     driver.close();
	}
}
