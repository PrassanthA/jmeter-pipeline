package Stest.MavenSelinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://blazedemo.com/");
//Select Flight
		 WebElement a1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		 Select s1 = new Select(a1);
		 s1.selectByIndex(1);
		 WebElement a2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		 Select s2 = new Select(a2);
		 s2.selectByIndex(2);
		 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
//choose flight
		 Boolean b = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).isDisplayed();
		 System.out.println(b);
		 
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
//Fill Form
//		  
		 
		 WebElement Fname = driver.findElement(By.id("inputName"));
		 Fname.sendKeys("Test");
		 
		 WebElement address = driver.findElement(By.id("address"));
		 address.sendKeys("Street 1");
		 
		 
		 WebElement city = driver.findElement(By.id("city"));
		 city.sendKeys("London");

		 WebElement state = driver.findElement(By.id("state"));
		 state.sendKeys("London");
		 
		 WebElement zip = driver.findElement(By.id("zipCode"));
		 zip.sendKeys("123456");
		 
		 WebElement a3 = driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		 Select s3 = new Select(a3);
		 s3.selectByIndex(0);
		 
		 WebElement ccard = driver.findElement(By.id("creditCardNumber"));
		 ccard.sendKeys("12345678909887");
		  
		 WebElement ccardm = driver.findElement(By.id("creditCardMonth"));
		 ccardm.sendKeys("12345678909887");
		 
		 WebElement ccardy = driver.findElement(By.id("creditCardYear"));
		 ccardy.sendKeys("creditCardYear");
		 
		 WebElement ccardn = driver.findElement(By.id("nameOnCard"));
		 ccardn.sendKeys("nameOnCard");
		 		 
		 driver.findElement(By.id("rememberMe")).click(); 
		
		 driver.findElement(By.xpath(" /html/body/div[2]/form/div[11]/div/input")).click();
		 
			 
		 

	}

}
