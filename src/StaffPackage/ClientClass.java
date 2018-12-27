package StaffPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClientClass {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		Login();
		
		for(int i=8;i<10;i++) {
			
			ClientAdd(i);
		}
		
		
		         
	}

	
	public static void Login() {
		
		
		  
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
	
	
	// client adding function
public static void ClientAdd(int i) {
	

	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	 driver.findElement(By.xpath("//*[@id=\"mainnav-menu\"]/li[18]/a")).click();
	 
	  try {
 			Thread.sleep(4000);
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
	         
	      
	     

	         Select cltitle = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[2]/div[1]/div/select")));
	         cltitle.selectByVisibleText("Mr");
	       
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[2]/div[2]/div/input")).sendKeys("Client");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[2]/div[3]/div/input")).sendKeys("Alii");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[2]/div[4]/div/input")).sendKeys(""+i);
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("customer"+i+"@retainoo.com");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("03051442145");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[2]/div[5]/div/input")).sendKeys("Client"+i);
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[6]/div/div/input")).sendKeys("09/07/1993");
	       
	       Select gentitle = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[7]/div[1]/div/select")));
	       gentitle.selectByVisibleText("Male");
	         
	       Select hairtitle = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[7]/div[2]/div/select")));
	       hairtitle.selectByVisibleText("Normal");  
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[8]/div[1]/div/input")).sendKeys("30");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[8]/div[2]/div/input")).sendKeys("40");
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/fieldset/div/div[1]/div/input")).sendKeys("Afganistan");
	     
	     driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/fieldset/div/div[2]/div/input")).sendKeys("Khushab");
	     
	      Select selcontry = new Select(driver.findElement(By.xpath("//*[@id=\"country-chose\"]")));
	       selcontry.selectByVisibleText("Pakistan");
	     
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/fieldset/div/div[4]/div/input")).sendKeys("Punjab");
	       driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/fieldset/div/div[5]/div/input")).sendKeys("Lahore");
	     driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/fieldset/div/div[6]/div/input")).sendKeys("89899");
	     
	     driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[2]/button[2]")).click();	         
	         
	
	
}	
}
