package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://leafground.com/button.xhtml");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/text()")).getText());
//System.out.println(driver.getPageSource().contains("Dashboard"));
//String s1=driver.getTitle();
System.out.println(driver.getTitle().contains("Dashboard"));
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().back();
System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled());
System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation());
System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color"));
System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize());
Thread.sleep(10000);
driver.close();


	}

}
