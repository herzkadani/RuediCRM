package crm.web;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCustomerTest {

	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/dev/geckodriver/geckodriver.exe"); // Example [path to gecko (firefox) driver] => "C:/dev/tools/geckodriver.exe")
		
	}
	
	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();	
		
        //Launch the Online Store Website
		driver.get("http://localhost:7070");
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("herzka");
		
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("dani");
		
		driver.findElement(By.cssSelector("p:nth-child(9) > input")).click();
		
		driver.findElement(By.name("customerId")).click();
		driver.findElement(By.name("customerId")).sendKeys("0");

		driver.findElement(By.cssSelector("p:nth-child(4) > input")).click();
		
		assertEquals(driver.findElement(By.id("firstname")).getText(), "Firstname: herzka");
		assertEquals(driver.findElement(By.id("name")).getText(), "Name: dani");
		
		
		//Wait for 5 Sec
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
	}

}
