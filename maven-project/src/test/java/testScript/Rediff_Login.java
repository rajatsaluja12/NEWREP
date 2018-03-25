package testScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Rediff_Login {

	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\temp.rajat-PC\\workspace\\December\\Selenium\\Core Java\\Executable Files\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("er.rajatsaluja@gmail.com");
	driver.findElement(By.cssSelector("#login1")).sendKeys("er.rajatsaluja@gmail.com");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("dsadsa");
	driver.findElement(By.xpath("//*[@name='proceed']")).click();
	driver.navigate().back();
	driver.findElement(By.partialLinkText("Forgot")).click();

	//System.out.println("Working fine");


	}
}
