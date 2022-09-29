package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("text")).sendKeys("dineshspidy51930@gmail.com");
		driver.findElement(By.xpath("(//div[@dir='auto'])[6]")).click();
		driver.findElement(By.name("password")).sendKeys("Dinesh@1101");
		driver.findElement(By.xpath("(//div[@dir='auto'])[8]")).click();
		

	}

}
