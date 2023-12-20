package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fblogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pras");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("2269");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7904681087");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Name@1234");
WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select s1=new Select(date);
s1.selectByValue("22");
WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select s2=new Select(month);
s2.selectByVisibleText("Jun");
WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select s3=new Select(year);
s3.selectByValue("1999");
driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}
