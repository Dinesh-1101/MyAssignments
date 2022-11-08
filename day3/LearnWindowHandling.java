package week7.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();	
    	Set<String> windowHandles=driver.getWindowHandles();
        List<String> List=new ArrayList<String>(windowHandles);
        driver.switchTo().window(List.get(1));
        driver.findElement(By.linkText("accountlimit100")).click();
        driver.switchTo().window(List.get(0));
        WebElement dinesh = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dop=new Select(dinesh);
        dop.deselectByVisibleText("Direct Mail");
	}

}
