package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004i_RegEx_xpath_css {
	
	public static void main(String[] args) {
		
		/*
		 * Syntax of xpath with regEx: 
		 * //tagname[contains(@attribute,'value')] OR //*[contains(@attribute,'value')]
		 * 
		 * Syntax of CSSselector with regEx:
		 * tagname[attribure*='value'] or [attribute*='value']
		 * 
		 */
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		
		/*
		 * <a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin">Sign in</a>
		 * css: a[title*='Sign In']
		 * 
		 * <input type="text" id="login1" maxlength="30" name="login" value="" tabindex="1">
		 * xpath: //input[contains(@id,'login')]
		 * 
		 * <input type="password" id="password" name="passwd" value="" tabindex="2">
		 * css: #password
		 * 
		 * <input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4" class="signinbtn">
		 * xpath: //*[@title='Sign In']
		 */
		
		
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("mittl");
		driver.findElement(By.cssSelector("#password")).sendKeys("pwsdfs");
		
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		
		driver.close();
	}
	

}
