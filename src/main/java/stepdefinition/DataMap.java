package stepdefinition;
	import java.util.Map;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class DataMap {
		 WebDriver driver;
		 
		
		 @Given("^user is home page$")
		 public void user_is_home_page() throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.freecrm.com/index.html");
			 Thread.sleep(200);
			 driver.findElement(By.name("username")).sendKeys("onetouchpal");
			 driver.findElement(By.name("password")).sendKeys("Easy2use");
			 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
			
		 }

		 
		 
		 @When("^user clicks on contact page$")
		public void user_clicks_on_contact_page() throws InterruptedException  {
			
			 driver.switchTo().frame("mainpanel");
				
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		     
		 }

		/* @Then("^user enters contact details$")
		 public void  user_enters_contact_details(DataTable alpha){
			 List<List<String>> beta = alpha.raw(); 
			 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(beta.get(0).get(0));//indexing
			 driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(beta.get(0).get(1));
			 driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(beta.get(0).get(2));
			 driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
		 }*/
		 
			@Then("^user enters contact details$")
			public void user_enters_contact_details(DataTable alpha) throws Throwable {
		 
				//Write the code to handle Data Table
				for (Map<String, String> data : alpha.asMaps(String.class, String.class)) {
					driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(data.get("firstname")); 
				    driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(data.get("surname"));
				    driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("company");
				    driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
					
							
				Actions action = new Actions(driver);
				
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
				    
					}
		 
			}
		
		 
		 @Then("^close the brower$")
		 public void close_the_brower()  {
		    driver.close();

		 }


	}
	


