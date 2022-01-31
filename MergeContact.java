package week4.day1day2.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException 
	{
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the window
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //3. Click on Login Button using Class Locator
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //4. Click on CRM/SFA Link
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    // 5. Click on contacts Button
	    driver.findElement(By.linkText("Contacts")).click();
	    //6. Click on Merge Contacts using Xpath Locator
	    driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
	    //7. Click on Widget of From Contact
	    WebElement find1 = driver.findElement(By.id("ComboBox_partyIdFrom"));
	    //8. Click on First Resulting Contact
	    find1.sendKeys("Anjana");
	    find1.sendKeys(Keys.TAB);
	    WebElement find2 = driver.findElement(By.id("ComboBox_partyIdTo"));
	    find2.sendKeys("Ganesan");
	    //9. Click on Widget of To Contact
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    Thread.sleep(5000);
	    //10. Click on Second Resulting Contact
	    //11. Click on Merge button using Xpath Locator
	    //12. Accept the Alert
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    // 13. Verify the title of the page
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}
}

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	


