package week7.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gurunanakcollege.edu.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='About Us']")).click();
		driver.findElement(By.partialLinkText("Home")).click();
		
	}

}
