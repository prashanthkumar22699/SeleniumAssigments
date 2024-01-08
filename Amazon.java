package week4day2Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
System.out.println(price);
System.out.println(driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText());
driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']")).click();
Set<String> handles = driver.getWindowHandles();
List<String> han=new ArrayList<String>(handles);
System.out.println(han);
driver.switchTo().window(han.get(1));
File ss = driver.getScreenshotAs(OutputType.FILE);
File src=new File("./Snaps/amazon1.png");
FileUtils.copyFile(ss, src);
driver.findElement(By.id("add-to-cart-button")).click();
Thread.sleep(5000);
String cartval = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
System.out.println(cartval);
if(cartval.contains("39,899"))
	System.out.println("values is correct");
	}

}
