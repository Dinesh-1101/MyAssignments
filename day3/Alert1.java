package week7.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver  driver=new ChromeDriver();
	driver.get("https://leafground.com/alert.xhtml;jsessionid=node0em80u7tr0ni0j6ottfcdulu9410236.node0");
	driver.findElement(By.xpath("//span[text()='Show']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
    driver.findElement(By.xpath("//span[text()='Yes']")).click();	
	
	
}

}
