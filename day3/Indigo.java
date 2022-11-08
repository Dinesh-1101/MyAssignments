package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indigo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rahul");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("yen per sooriyaaaaaaa yen veedu india");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Hello musicians");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dineshspidyzendiya.mj@gmail.com");
		WebElement generalStateProvinceGeoId1=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd1=new Select(generalStateProvinceGeoId1);
		dd1.selectByVisibleText("New York");	
		driver.findElement(By.className("smallSubmit")).click();

	}

}
