package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004h_CustomizeCSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
			
		/*A. CssSelector syntax: tagname[attribute='Value'] or [attribute='Value'] 
	
		 * FACEBOOK:
		  * <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		  *  CSS: input[name='email']
		  * 
		  * <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		  * css: [type='password']
		  * 
		  * <input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
		  * css: input[value='Log In']
		  *
		  * 
		  * 
		 *B. CSSselector has another shortcuts
		  *   a. tagname#id or #id
		  *   b. tagname.classname or .classname
		  * 
		  * SalesForce  
		  *https://login.salesforce.com/?locale=in
		  *
		  *
		  *<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
		  *css: input#username (tagname#id)
		  *
		  *<input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" onkeypress="checkCaps(event)" autocomplete="off">
		  *css: #password
		  *
		  *<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
		  *css: #Login
		  */
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mittal");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("pwd");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("mittal");
		driver.findElement(By.cssSelector("#password")).sendKeys("pwd");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
