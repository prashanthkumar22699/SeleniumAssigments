package week3assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ajio.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//div[@class='filter']/div")).getText());
Thread.sleep(5000);
List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
List<String> b=new ArrayList<String>();
for (WebElement each : brands) {
	String s=each.getText();
	b.add(s);
}
System.out.println(b);
List<WebElement> bagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
List<String> names=new ArrayList<String>();
for (WebElement each : bagnames) {
	String s=each.getText();
	names.add(s);
}
System.out.println(names);
	}

}
