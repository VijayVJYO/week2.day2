package selenium;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class LeafTaps {
		
			
		     public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				
				//find username and type value in textbox
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				String text=driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
				driver.findElement(By.linkText("CRM/SFA")).click();
				String title=driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zoho");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VIJAYAN");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("VIJAYAN");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SOFTWARE TESTER");
			    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SANKAR");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("SANKAR");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("102342");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("team member");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("exellence");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("WORK");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/10/2001");
				//CONTACT INFORMATION            

				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("India");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("916473");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Employee");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("VJ@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("VJ.com");
	            //address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("VJ");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TKM");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CHENGALPATTU");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603102");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("603102");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("VJ");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("NEIKUPPI");		
				
				
		
		        WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
	            Select dd1=new Select(ele);
	            dd1.selectByVisibleText("Employee");
	            
	            Select dd2=new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
	            dd2.selectByIndex(3);
	            
	            Select dd3=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
	            dd3.selectByValue("OWN_CCORP");
	            
	            Select dd4=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
	            dd4.selectByVisibleText("Automobile");
	            
	            Select dd5=new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
	            dd5.selectByVisibleText("India");
	            
	            Select dd7=new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
	            dd7.selectByVisibleText("INR - Indian Rupee");
	            
	            Select dd6=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	            dd6.selectByVisibleText("TAMILNADU");
	            
				driver.findElement(By.className("smallSubmit")).click();
				
				String text1=driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println(text1);
	            
	            








	            
						
				
				
			}
			}




