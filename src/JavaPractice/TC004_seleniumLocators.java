package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_seleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 6 locators:
		 * 1. id
		 * 2. name
		 * 3. classname
		 * 4. linkText
		 * 5. xpath
		 * 6. css locators
		 * 
		 * Notes:
		 * Best practices for continuity in framework, xpath and css locators are used
		 * every attribute/web object may not have id/name/classname locators.
		 * 
		 * if id locator is having alphanumeric value, then it will normally change after refreshing the page. 
		 * So preferred not to use the id locator in such case
		 * 
		 * linkText element is defined with starting TAG "a" (anchor) in source code.
		 * "a" indicates it is the link which navigate to another page.
		 * 
		 * Class name with Blank spaces in between, selenium would not able to accept it as locator.
		 * It gives error: "Compound class cannot be accepted".
		 * 
		 * Multiple values
		 * if multiple web objects have same attribute value to locate them -> Dont use such locator
		 * because selenium would not throw any error for that but it will scan the wehpage from left upper part of screen and
		 * identify the first object by that locator and ignore the second object.
		 * i.e. userid and pwd both have same classname and if you use classname locator for identifying pwd,
		 * selenium would locate username (which comes first while scanning) as object.
		 * 
		 * 
		 * 
		 * b
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		
		/*
		//id, class and linkText
		
		//Facebook
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys("Username");
		driver.findElement(By.name("pass")).sendKeys("my pwd");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		*/
		
		
		/*
		//classname having spaces
		//Saleforce
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.name("pw")).sendKeys("my pwd");
		
		
		driver.findElement(By.className("button r4 wide primary")).click();
		//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".button\ r4\ wide\ primary"}
		
		
		*/
		
		/*
		//Multiple objects having same class name. Selenium take 1st index ignores 2nd. Scan from left upper to right bottom
		//lifestyle
		
		driver.get("https://www.lifestylestores.com/in/en/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.className("form-control")).sendKeys("Username");
		driver.findElement(By.className("form-control")).sendKeys("my pwd");
        */
		
		
		//it got written both value in search bar
		
		
		/*
		 * Xpath & CSS locator can be generated using browser tool ( firefox or chrome ), but it is not always accurate.
		 * accuracy could be sometime 80-90%. but you can customize the xpath/css locator by your own.
		 * 
		 * xpath: go to inspect element, hover cusror on object, it would hightlight soucecode...rightclivk on highlighted code...copy-> copy xpath
		 * xpath can be defined in number of ways, so it is possible different browser would give different xpath.
		 * 
		 * 
		 * browser gives you xpath value with double quotes, so if you use it direct;y..it became doublequotes inside the doublequotes
		 * and java cannot read that, so update the xpath copied from the browser tool and replace double quotes (") with single quote (')
		 */
		
		//xpath
		//facebook
		
		/*
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Username");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("my pwd");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();//*[@id="u_0_b"]
		driver.quit();
		
		*/
		driver.close();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		 
		
		
	}

}
