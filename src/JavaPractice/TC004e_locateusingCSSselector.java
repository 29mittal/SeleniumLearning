package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004e_locateusingCSSselector {
	public static void main(String[] args) {
		
		/*Locate the element using cssselector
		There are n no of ways to generate css n xpath
		when firefox browser provides xpath or css starts from html, then dont use, it is very unstable, 
		Use xpath genereated by chrome browser (not starts with HTML) in such cases
		In Chrome browser, there is no direct option for ccsSelector, you need to hover the cursor on the bottol line tabs
		and select the one which exactly refers the desired object on webpage as CSSSelector
		*/
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("MITT");
		driver.findElement(By.cssSelector("#password")).sendKeys("nirav");
		driver.findElement(By.cssSelector("#Login")).click();
}
}
