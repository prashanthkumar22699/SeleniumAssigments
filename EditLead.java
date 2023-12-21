package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	@SuppressWarnings("deprecation")
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
        driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'createLeadForm')]")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prashanth");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Prash");
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CS");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Edit Lead Assignment");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("example@123.com");
	WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select sel=new Select(state);
	sel.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Updated Lead Info");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	String s1=driver.getTitle();
	System.out.println(s1);
	driver.close();
	}
	

}
