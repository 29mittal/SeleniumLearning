package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004c_DuplicateAttribute {
//Multiple values- Selenium identifies it as first element from top left-right to bottom
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("inputtext")).sendKeys("NewUser");
		driver.findElement(By.className("inputtext")).sendKeys("NewPassword");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.close();
	}
}
