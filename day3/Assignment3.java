package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("She");
		driver.findElement(By.id("lastNameField")).sendKeys("Her");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jp");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("PP");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Bca");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Am working in Accenture Health Care");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dinesh@gmail.com");
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd1=new Select(state);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("My studies are fine here but i cant concentrate properly.. waiting here");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println(title);

		

		
		


	}

}
