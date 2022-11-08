package week7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

	public static void main(String[] args) {
		//launch Webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.get("https://www.rti.org/services-and-capabilities");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement name=driver.findElement(By.name("dataSourceId"));
		Select ddl=new Select(name);
		ddl.selectByVisibleText("Tradeshow");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select ddl2=new Select(industry);
		ddl2.selectByVisibleText("Distribution");
		//driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
    	Set<String> windowHandles=driver.getWindowHandles();
        List<String> List=new ArrayList<String>(windowHandles);
        driver.switchTo().window(List.get(1));
        driver.findElement(By.linkText("10002")).click();
        driver.switchTo().window(List.get(0));
        driver.findElement(By.name("accountName")).click();
        
        
	}

}
