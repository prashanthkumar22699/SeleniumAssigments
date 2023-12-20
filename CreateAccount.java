package week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Week2Assignment");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
WebElement ind= driver.findElement(By.xpath("//select[@name='industryEnumId']"));
Select sel=new Select(ind);
sel.selectByIndex(3);
WebElement own=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
Select sel1=new Select(own);
sel1.selectByVisibleText("S-Corporation");
WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
Select sel2=new Select(source);
sel2.selectByValue("LEAD_EMPLOYEE");
WebElement mc=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
Select s3=new Select(mc);
s3.selectByIndex(6);
WebElement state=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
Select s4=new Select(state);
s4.selectByValue("TX");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
Thread.sleep(20000);

driver.close();
	}

}
