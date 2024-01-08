package week4day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement mens = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
Actions a=new Actions(driver);
a.moveToElement(mens).click().perform();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@data-index='1.1.2']//span[text()='Sports Shoes']")).click();
System.out.println(driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText());
driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
//Select sel=new Select(dd);
//sel.selectByIndex(1);
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
driver.findElement(By.xpath("//input[@name='toVal']")).clear();
driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
Thread.sleep(5000);
//WebElement element = driver.findElement(By.xpath("(//a[@class='filter-name'])[5]"));
//Actions b=new Actions(driver);
//b.scrollToElement(element).perform();
//element.click();

WebElement img = driver.findElement(By.xpath("//img[@title='RICKENBAC Blue Training Shoes']"));
a.moveToElement(img).perform();
Thread.sleep(10000);
driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
Thread.sleep(3000);
String mrp = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]")).getText();
String disc = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]")).getText();
System.out.println(mrp+" is the price and the discount is "+disc);





	
	
	}

}
