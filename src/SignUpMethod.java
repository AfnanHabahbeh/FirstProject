import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class SignUpMethod {
	WebDriver driver = new ChromeDriver();
	String [] FirstName = {"Ahmad", "Loay", "Tamer"};
	String [] LastName = {"Habahbeh", "Dajaa","Shbekat"};
	Random rand= new Random();
	int randomIndex =rand.nextInt(3);
	int randomEmailID = rand.nextInt(999);
	String UserFirstName = FirstName[randomIndex];
	String UserLastName = LastName[randomIndex];
	String email_Address = UserFirstName + UserLastName + randomEmailID + "@gmail.com";


	
	
@BeforeTest()
public void SetUp() {
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	WebElement SignUpButton= driver.findElement(By.linkText("Create an Account"));
}


@Test()
	public void SignMethod() {}

}
