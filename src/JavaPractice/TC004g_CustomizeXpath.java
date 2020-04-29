package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC004g_CustomizeXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	
		
		/*xpath syntax: //tagname[@attribute='Value'] or //*[@attribute='Value'] here '*' for regular expressions
		 * reg ex means doesnot matter whatever the value at the place of '*"
		 
		 //input[@type='email']
		
		  * <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		  *  xpath: //input[@type='email']
		  * 
		  * <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		  * xpath: //*[@id='pass']
		  * 
		  * <input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
		  * xpath: //input[@value='Log In']
		  */
		 
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pwd");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
