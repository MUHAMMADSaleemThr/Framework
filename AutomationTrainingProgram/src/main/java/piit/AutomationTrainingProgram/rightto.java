package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightto {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IGU Staff\\eclipse-workspaceRestore\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
        driver.manage().window().maximize();
		// TODO Auto-generated method stub
        Thread.sleep(6000);
WebElement Picture=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/div/table/tbody/tr/td/p/img"));
		//"//*[@style='cursor: pointer;']"));
Actions ob=new Actions(driver);
ob.contextClick(Picture);
	}

}
