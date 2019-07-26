package gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class addcart {
	WebDriver driver;
	//int find;
	@Given("open valid browser")
	public void open_valid_browser() {
   	   System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
   	   driver=new ChromeDriver();
   	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

	@Given("provide uname and pwd")
	public void provide_uname_and_pwd() {
	   driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("search for a product")
	public void search_for_a_product() {
	   WebElement search= driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	   Actions act=new Actions(driver);
	   act.sendKeys(search,"gift set").build().perform();
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Given("check add cart")
	public void check_add_cart() {
	    //driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	  int find=driver.findElements(By.partialLinkText("Cart")).size();
	   if(find>0)
	   {
		   Assert.assertTrue(false);
	   }
	   else
	   {
		   Assert.assertTrue(true);
	   }
	}
	

}
