package ooooooo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jjjjj {
	
	WebDriver driver = new EdgeDriver();
	String userName="standard_user";
	String password="secret_sauce";
	@BeforeTest
	public void mySetUp() {
		driver.get("https://automationteststore.com/index.php?rt=account/create");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void navigateToLoginPage() {
		driver.navigate().to("https://automationteststore.com/index.php?rt=account/login");
	}
	@Test(priority=2)
	public void checkTheLoginWindow() {
		String loginWindowName="I am a new customer.";
		String loginWindowNameUpperCase=loginWindowName.toUpperCase();
		String loginWindowNameElement=driver.findElement(By.xpath("//h2[normalize-space()='I am a new customer.']")).getText();
		Assert.assertEquals(loginWindowNameUpperCase, loginWindowNameElement);
	}
	@Test(priority=3)
	public void logIn() {
		WebElement countinueButton=driver.findElement(By.cssSelector("button[title='Continue']"));
		   String firstName[]= {"Ahmad","Mohammad","Talal","Tala","Sara"};
		   String lastName[]= {"Allan","Ehsan","AlHussein","Alzboun"};
		countinueButton.click();
	WebElement firstNameInput=driver.findElement(By.name("firstname"));
	WebElement lastNameInput=driver.findElement(By.name("lastname"));
	    Random rand1=new Random();
	    Random rand2=new Random ();
	    int firstNameIndex=rand1.nextInt(firstName.length);
	    int lastNameIndex=rand2.nextInt(lastName.length);
	    firstNameInput.sendKeys(firstName[firstNameIndex]);
	    lastNameInput.sendKeys(lastName[lastNameIndex]);
	    
	}
	@Test(priority=4)
	public void checkAddressText() {
		boolean isExist=true;
		WebElement addressText=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > h4:nth-child(6)"));
		boolean isDisplayed=addressText.isDisplayed();
	}

}
