package week5.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> List=new ArrayList<String>(windowHandles);
 		driver.switchTo().window(List.get(1));
 		driver.findElement(By.xpath(""))
		driver.findElement(By.xpath("//a[text()='11419']")).click();

		driver.switchTo().window(List.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
 		driver.switchTo().window(List.get(1));

		driver.findElement(By.xpath("//a[text()='11428']")).click();
		driver.switchTo().window(List.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String txt=driver.getTitle();
		System.out.println(txt);

		 


		



	}

}
