package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookSignup {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test
	public void forgetPassword() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("agrawalnitin12@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("LGsoft123");
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("agrawalnitin12@gmail.com");
		driver.findElement(By.name("did_submit")).click();
		driver.findElement(By.xpath("//a[@name='reset_action']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.name("firstname")).sendKeys("nitin");
		driver.findElement(By.name("lastname")).sendKeys("agrawal");
		driver.findElement(By.name("reg_email__")).sendKeys("9953790460");
		driver.findElement(By.name("reg_passwd__")).sendKeys("LGsoft123");
		Select dd = new Select(driver.findElement(By.id("day")));
		dd.selectByVisibleText("12");

		Select mm = new Select(driver.findElement(By.id("month")));
		mm.selectByVisibleText("Jun");

		Select yy = new Select(driver.findElement(By.id("year")));
		yy.selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @id='u_0_b']")).click();

	}

	@Test
	public void signUp() {

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}
}
