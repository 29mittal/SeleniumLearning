/**
 * 
 */
package JavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author nirmit
 *
 */
public class TC002_chrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "//Users//nirmit//documents//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\google.com");
		System.out.println(driver.getTitle());
	}

}
