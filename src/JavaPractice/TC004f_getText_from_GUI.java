package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004f_getText_from_GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("mitt");
		driver.findElement(By.cssSelector("#password")).sendKeys("paswrd");
		
		driver.findElement(By.id("Login")).click();
		
		System.out.println( driver.findElement(By.xpath("//*[@id=\'error\']")).getText() );
		
	
	}

}
