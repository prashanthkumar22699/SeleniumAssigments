package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
        driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("134-3793");
        driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
        WebElement web=driver.findElement(By.xpath("//td[@tabindex='0']"));
        //String str=web.getText();
        System.out.println(web.getText());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='DemoLeadC']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
        driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(web.getText());
        driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Boolean msg=driver.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed();
        System.out.println(msg);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
       
	}

}
