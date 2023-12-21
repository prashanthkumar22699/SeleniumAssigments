package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
boolean b1=driver.findElement(By.xpath("//div[@id='j_idt87:msg_container']")).isDisplayed();
System.out.println(b1);
driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
System.out.println(driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).isSelected());
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//boolean b3=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).isSelected();
//System.out.println(b3);
driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:msg_container']")).isDisplayed());
System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected());
driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
driver.findElement(By.xpath("//li[@data-item-value='Miami']/div")).click();
driver.findElement(By.xpath("//li[@data-item-value='Paris']/div")).click();
driver.findElement(By.xpath("//li[@data-item-value='Istanbul']/div")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.quit();
	}

}
