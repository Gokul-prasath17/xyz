package gluecode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.When;

public class search {
WebDriver driver;
@When("open google")
public void open_google() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\ChromeDriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
    Thread.sleep(2000);
}

@When("login using valid credential")
public void login_using_valid_credential() throws InterruptedException {
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  Thread.sleep(2000);
}

@When("search a product")
public void search_a_product() {
	WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	Actions act=new Actions(driver);
	act.sendKeys(search,"head").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}

@When("check if the searched product is present or not")
public void check_if_the_searched_product_is_present_or_not() {
     String check=driver.getTitle();
     Assert.assertTrue(check.contains("Search"));
     driver.close();
     
}


}
