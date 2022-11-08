package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//a[text()='Find Leads']
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ARUN");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//a[text()='ARUN'])[1]")).click();
		String hello=driver.getTitle();
		System.out.println(hello);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement object = driver.findElement(By.name("companyName"));
		object.clear();
		object.sendKeys("Accenture");
		driver.findElement(By.name("submitButton")).click();
		WebElement jp = driver.findElement(By.id("viewLead_companyName_sp"));
		jp.getText();
		System.out.println(jp);
		driver.close();


		

	}

}
