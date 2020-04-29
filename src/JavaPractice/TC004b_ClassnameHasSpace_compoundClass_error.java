package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004b_ClassnameHasSpace_compoundClass_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("Mittal");
		driver.findElement(By.name("pw")).sendKeys("Mitu");
		
		driver.findElement(By.className("button r4 wide primary")).click();
	}

}
