package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	static WebDriver driver;

	@BeforeClass
	public static void tc0() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@Before
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc1() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Greens");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("greens");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

}
