//import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {
	
//     static String a = "";    
    		

	public static void main(String[] args) {
		
		
		   
		for(int i = 2; i<5; i++) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver.exe");
			
			   WebDriver driver = new ChromeDriver();
			
			registersalon(i,driver);
			makeSalon(i,driver);
		}
      
	}
	

//   function for randomly generating string
//	protected static String getSaltString() {
//		
//	    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//	    StringBuilder salt = new StringBuilder();
//	    Random rnd = new Random();
//	    while (salt.length() < 6) { // length of the random string.
//	        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//	        salt.append(SALTCHARS.charAt(index));
//	    }
//	    String saltStr = salt.toString();
//	    return saltStr;
//	
//	}
	
	
	protected static void registersalon(int i, WebDriver driver) {
		
		
		
		   driver.manage().window().maximize();
		   driver.get("http://my5tech.com/dev/retainoo/sign-up-to-simple-retainoos/?title=POPULAR_RETENTION");
		   
		   try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		   
		   driver.findElement(By.xpath("//*[@id=\"FullNameTB\"]")).sendKeys("Salon");
	       driver.findElement(By.xpath("//*[@id=\"MNameTB\"]")).sendKeys("Test"); 
	       driver.findElement(By.xpath("//*[@id=\"LameTB*\"]")).sendKeys(""+ i );
	       driver.findElement(By.xpath("//*[@id=\"Businessname*\"]")).sendKeys("MyBusiness");
	       Select designdropdown = new Select(driver.findElement(By.xpath("//*[@id=\"PackageDDL\"]")));
	       designdropdown.selectByIndex(2);
	       driver.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys("Salon" +i+"@retainoo.com");
	       Select timezone = new Select(driver.findElement(By.xpath("//*[@id=\"time_zone\"]")));
	       timezone.selectByIndex(247);;
	       
	   
	       WebElement plancheckbox = driver.findElement(By.xpath("//*[@id=\"signupPackageSelect\"]/div[2]/div/div[2]/input"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();",plancheckbox); 
	       
	       driver.findElement(By.xpath("//*[@id=\"signup1\"]/div[15]/input")).sendKeys("4111111111111111");
	       driver.findElement(By.xpath("//*[@id=\"signup1\"]/div[16]/input")).sendKeys("123");
	       driver.findElement(By.xpath("//*[@id=\"signup1\"]/div[17]/div[1]/input")).sendKeys("03");
	       driver.findElement(By.xpath("//*[@id=\"signup1\"]/div[17]/div[2]/input")).sendKeys("2025");
	     
	       WebElement termscheckbox = driver.findElement(By.xpath("//*[@id=\"signup1\"]/p/input[1]"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();",termscheckbox);
	       
	       WebElement policycheckbox = driver.findElement(By.xpath("//*[@id=\"signup1\"]/p/input[2]"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();",policycheckbox);
	       
	       WebElement tcheckbox = driver.findElement(By.xpath("//*[@id=\"signup1\"]/p/input[3]"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();",tcheckbox);
	       
	       
	       
//	       To Scroll
//	       JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("window.scrollBy(0,5000)");
	       
//	       try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	       
	     
	       driver.findElement(By.xpath("//*[@id=\"signupNext\"]")).click();
	       
	       try {
				Thread.sleep(35000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
		
	}
	
	//Function for making salon
	protected static void makeSalon(int i, WebDriver driver) {
		
		
	       
	       
	       
	       
	    
		  // driver.findElement(By.xpath("//*[@id=\"menu-item-14166\"]/a/span")).click();
		   
		   //driver.findElement(By.xpath("//*[@id=\"post-14156\"]/div/div[10]/div/div[2]/span/a/span")).click();
		   
		   
	       
	       
	       
	       
		   
		
		  // Base Url
//	      driver.get("http://dev.retainoo.com/#/business-admin/account/register");
//       driver.manage().window().maximize();
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[1]/div/input")).sendKeys("Salon");
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[2]/div/input")).sendKeys("For"); 
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/div/input")).sendKeys(""+i); 
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/div/input")).sendKeys("salon"+ i + "@retainoo.com"); 
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[5]/div/input")).sendKeys("salon"+ i + "@retainoo.com");
//       Select dropdown = new Select(driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div/div/form/div[6]/div/select")));
//       dropdown.selectByIndex(1);
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[7]/div/input")).sendKeys("Salon"+i);
//      
//       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[8]/label"));
//       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
//       
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/button")).click();
//       
//       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/button")).click();
  
       //now the login screen starts
       
       
       
//       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       driver.get("http://stage.retainoo.com/#/business-admin/account/login");
       
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/div[1]/input")).sendKeys("salon"+ i + "@retainoo.com");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/div[2]/input")).sendKeys("retainoo");
                
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/form/button")).click();
       
       try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       // Reset Password
       
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/form/div[1]/div/input")).sendKeys("retainoo");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/form/div[2]/div/input")).sendKeys("Retainoo12");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/form/div[3]/div/input")).sendKeys("Retainoo12");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/div/button")).click();
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       
       
       
       driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div/div/div/div/div/button")).click();
       driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div/div/div/div/div/button")).click();
       
       try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
   	 
    }
    	   
       
       
       
     String currentUrl="http://stage.retainoo.com/#/business-admin/wizard";
     
     if(currentUrl.contains("/wizard")){
    	 
    	 try {
 			Thread.sleep(20000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
    	 
     }
     
       
       
     
     
		}
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[1]/input")).sendKeys("TestSalon"+i);
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[3]/input")).sendKeys("salon"+ i + "@retainoo.com");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[4]/input")).sendKeys("03256478589");
       

       driver.findElement(By.xpath("//*[@id=\"business_categories_chosen\"]/ul/li/input")).click();
       driver.findElement(By.xpath("//*[@id=\"business_categories_chosen\"]/div/ul/li[1]")).click();
       
     Select list = new Select(driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[6]/div[1]/div[2]/select")));
     list.selectByVisibleText("PKR");
     
     
     Select type = new Select(driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[6]/div[2]/div[2]/select")));
     type.selectByVisibleText("Unisex");
       
       
       
       
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[1]/div[7]/div/div/textarea")).sendKeys("Best Saloon In The World");
       
       WebElement mcheckbox = driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-business/div/form/div/div[1]/div[2]/div/div[2]/fieldset/div[1]/label"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();",mcheckbox); 
       
       
      // driver.findElement(By.xpath("//*[@id=\"dz-upload-salon-picture\"]")).sendKeys("C:\\Users\\Anzalna\\Desktop\\Project Data\\Project Pics\\team.png");
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
              //Address page
       
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[1]/div[1]/div/input")).sendKeys("Park View");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[1]/div[2]/div/input")).sendKeys("Khanpur");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[2]/div[1]/div/input")).sendKeys("Near Round About");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[2]/div[2]/div/input")).sendKeys("Lahore");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[3]/div[1]/div/input")).sendKeys("Punjab");
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-address/div/form/div/div[3]/div[2]/div/input")).sendKeys("54000");
       
       
       Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country-chose\"]")));
       country.selectByVisibleText("Pakistan");
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       // social link
       
       driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-social/div/form/div/div[1]/input")).sendKeys("www.facebook.com/alixaidisyed");
       
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       try {
 			Thread.sleep(8000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
       
       
       
       // theme select
       
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       
       try {
  			Thread.sleep(8000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
       
       
       // Features   
       
       WebElement appcheckbox = driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-feature/div[1]/div[2]/div/label"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", appcheckbox);
       
       WebElement loycheckbox = driver.findElement(By.xpath("//*[@id=\"test_id\"]/app-feature/div[2]/div/div[2]/div/div/label"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loycheckbox);
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       
       
     // driver.findElement(By.xpath("//*[@id=\"c2\"]")).sendKeys("1.00");
       
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       // awards
       
       driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       
       
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       // timings page
       
       
       WebElement satcheckbox = driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div/table/tbody/tr[6]/td[2]/label"));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", satcheckbox);
     
     
     WebElement suncheckbox = driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div/table/tbody/tr[7]/td[2]/label"));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", suncheckbox);
     
     driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
     
     
     try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     WebElement headcheckbox = driver.findElement(By.xpath("//*[@id=\"demo-dt-basic\"]/tbody/tr[1]/td[7]/label"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", headcheckbox);
     
     WebElement head1checkbox = driver.findElement(By.xpath("//*[@id=\"demo-dt-basic\"]/tbody/tr[2]/td[7]/label"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", head1checkbox);
   
     WebElement hotcheckbox = driver.findElement(By.xpath("//*[@id=\"demo-dt-basic\"]/tbody/tr[4]/td[7]/label"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hotcheckbox);
   
     WebElement medccheckbox = driver.findElement(By.xpath("//*[@id=\"demo-dt-basic\"]/tbody/tr[11]/td[7]/label"));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", medccheckbox);
     
     WebElement pregcheckbox = driver.findElement(By.xpath("//*[@id=\"demo-dt-basic\"]/tbody/tr[16]/td[7]/label"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pregcheckbox);
   
   driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
   
     
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       // add staff
       
       
       
       driver.findElement(By.xpath("//*[@id=\"demo-btn-addrow\"]")).click();
       
       try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       Select title = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[1]/div/select")));
       title.selectByVisibleText("Mr");
       
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Stylist");
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[3]/div/input")).sendKeys("Ahmed");
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[2]/div/div[4]/div/input")).sendKeys(""+i);
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("stylist"+ i +"@retainoo.com");
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("03214521458");
       
       Select etype = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[3]/div/select")));
       etype.selectByVisibleText("Casual");
       
       Select des = new Select(driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[3]/div[4]/div/select")));
       des.selectByVisibleText("Senior Stylist");
       
       driver.findElement(By.xpath("//*[@id=\"add-new-staff\"]/app-add-staff/div/div/form/div[1]/div[4]/div[1]/div/input")).sendKeys("Staff"+i);
       
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
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
     driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
       
       
       try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       //  add client
       
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
   driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("customer"+ i +"@retainoo.com");
   driver.findElement(By.xpath("//*[@id=\"add-new-customer\"]/app-add-customer/div/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("552255445566");
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
   
   
   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[2]")).click();
   
   
   
   try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


   driver.findElement(By.xpath("//*[@id=\"demo-step-wz\"]/div[2]/div[2]/div/button[3]")).click();
   
   
   try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    driver.close();
		
	}
}


