package week7.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(2);
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("Click")).click();
		


	}

}
