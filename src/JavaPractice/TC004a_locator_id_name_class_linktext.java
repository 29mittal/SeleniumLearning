package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004a_locator_id_name_class_linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login to facebook using userid n pwd and click on forgot pwd link
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("NewUser");
		driver.findElement(By.id("pass")).sendKeys("NewPassword");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	}
	
}

