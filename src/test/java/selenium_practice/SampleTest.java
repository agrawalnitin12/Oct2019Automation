package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTest {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.testandquiz.com/selenium/testing.html");

		String text = driver.findElement(By.xpath("//div[@style='font-size:15px;']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.linkText("This is a link")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.name("firstName")).sendKeys("nitin agrawal");
		
		driver.findElement(By.id("idOfButton")).click();
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.xpath("//input[@class='Performance']")).click();
		
		Select dd = new Select(driver.findElement(By.id("testingDropdown")));
		dd.selectByVisibleText("Manual Testing");
		
		String currentWin = driver.getWindowHandle();
		driver.switchTo().window(currentWin);
		
	}

}
