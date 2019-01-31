package StaffPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class StaffClass {
	
	private WebDriver driver;
	
	public StaffClass() {
		this.initDriver();
	}
	
	void initDriver() {
		driver = new ChromeDriver();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver.exe");
		
		StaffClass sc = new StaffClass();
		
		sc.login();;
		
		for(int i=3; i<5; i++) {
			
			sc.StaffAdd(i);
		}
		         
	}
	
	
	
	
	void login(int i) {
		

	      driver.get("http://dev.retainoo.com/#/business-admin/account/login");
	      
	      
	      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/div[1]/input")).sendKeys("salon1@retainoo.com");
	         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/div[2]/input")).sendKeys("Retainoo12");
	                  
	         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/button")).click();
	         
	         
	         try {
	  			Thread.sleep(10000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
		
		
	}

	void StaffAdd(int i) {
	
		
		
		  try {
	  			Thread.sleep(5000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
		   
        driver.findElement(By.xpath("//*[@id=\"mainnav-menu\"]/li[17]/a/span/strong")).click();
        
        
        try {
	  			Thread.sleep(7000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
        
        driver.findElement(By.xpath("//*[@id=\"demo-btn-addrow\"]")).click();
        
        
        try {
  			Thread.sleep(4000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        
        
        
        Select stafftitle = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[1]/div/select")));
        stafftitle.selectByVisibleText("Mr");
                                                                   
        
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Stylist");
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[3]/div/input")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[4]/div/input")).sendKeys(""+i);
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("stylist"+i+"@retainoo.com");
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("03214521458");
        
        Select etype = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[3]/div/select")));
        etype.selectByVisibleText("Full Time");
        
        Select des = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[4]/div/select")));
        des.selectByVisibleText("Senior Stylist");
        
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[4]/div[1]/div/input")).sendKeys("Sylist"+i);
        
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/fieldset/div/div[1]/div/input")).sendKeys("Shekhupura");
        
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/fieldset/div/div[2]/div/input")).sendKeys("Kpk");
        
        
        Select ctrytype = new Select(driver.findElement(By.xpath("//*[@id=\"country-chose\"]")));
        ctrytype.selectByVisibleText("Pakistan");
        
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/fieldset/div/div[4]/div/input")).sendKeys("Punjab");
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/fieldset/div/div[5]/div/input")).sendKeys("Lahore");
        driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/fieldset/div/div[6]/div/input")).sendKeys("1425425");
        
        WebElement sercheckbox = driver.findElement(By.xpath("//*[@id=\"demo-form-checkbox-3\"]"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sercheckbox);
      
      
      
      driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[2]/button[2]")).click();
        
		
	}
}
