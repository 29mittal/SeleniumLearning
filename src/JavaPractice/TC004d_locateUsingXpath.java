package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004d_locateUsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		
		//How to get xpath? -
		//Rightclick on blue highlighted HTML code -> select copy-> copy xpath
		
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("UserN?ame");
		//Double quotes inside double quote is not allowed in  JAVA
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("UserN?ame");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Pwd");
		//Xpath can be defined in n no of ways
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
		
		
	}
	

}
