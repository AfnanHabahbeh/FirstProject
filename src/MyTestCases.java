
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyTestCases {
	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void setUp() {
		driver.get("https://magento.softwaretestingboard.com/");
		//driver.get("http://127.0.0.1:5500/lessonten.html");
		// driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
	WebElement SignUpButton =	driver.findElement(By.linkText("Create an Account"));
	SignUpButton.click();
	}

	@Test(enabled = false)
	public void AllCommand() throws InterruptedException {
		// To stop for a while(3 ms):
		Thread.sleep(5000);
		// For control the screen:
	//	driver.manage().window().maximize();
		// Write an array of string + go through all the items: (IMPORTANT NOTE that I
		// have use the "Public static void main (sting[]args)" for the methods when
		// creating a new class)
		//String[] CitiesOfTheWorld = {}; // see MyClass.java

	}

	@Test(enabled = false)
	public void MyFirstTest() throws InterruptedException {

		// driver.findElement(By.name("InputForTheEmail")).sendKeys("Abeer@gmail.com");
		// driver.findElement(By.name("inputForThePassword")).sendKeys("Abeer");
		// Thread.sleep(3000);
		// driver.findElement(By.id("submitButtonsoso")).click();
		// driver.findElement(By.linkText("Instgram page")).click();
		// driver.findElement(By.xpath("//li[normalize-space()='instagram
		// page']")).click(); //you should use rel xpath
		// driver.findElement(By.cssSelector("a[id='insta'] li")).click(); // you should
		// use rel css selector

	}

	@AfterTest(enabled = false)
	public void PostTesting() {
		// driver.close();

	}

}
