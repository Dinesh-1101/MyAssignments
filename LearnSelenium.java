
package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();     
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Triangular Photography");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Koushik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dinesh");
		driver.findElement(By.name("submitButton")).click();

		




		
		
		

	}

}
