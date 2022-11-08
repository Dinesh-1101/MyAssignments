package week5.day5;

import java.time.Duration;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
		driver.findElement(By.id("lastNameField")).sendKeys("A");
		driver.findElement(By.name("lastNameLocal")).sendKeys("A");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Hai this is dinesh i dont know what to fill in this column");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dinesg@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown=new Select(findElement);
		dropDown.selectByVisibleText("Indiana");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement object = driver.findElement(By.name("description"));
		object.clear();
		object.sendKeys("Hai this is dinesh i dont know what to fill in this column udate as well");
		driver.findElement(By.name("importantNote")).sendKeys("test test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String hello=driver.getTitle();
		System.out.println(hello);
		driver.close();

		
		

		


		



		

		

	}

}
