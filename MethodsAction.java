import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsAction {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	// url launch
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//create new account
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// first name and last name
    driver.findElement(By.name("firstname")).sendKeys("Twinkle");
    driver.findElement(By.name("lastname")).sendKeys("twin");
    
    // email
    driver.findElement(By.name("reg_email__")).sendKeys("testuser@gmail.com");
    
    //password
    driver.findElement(By.id("password_step_input")).sendKeys("Test123#");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@gmail.com");
    
// Date of birth
   WebElement ddown=driver.findElement(By.id("day"));
   Select select= new Select(ddown);
   
   select.selectByValue("11");



   WebElement ddown_month = driver.findElement(By.id("month"));
   Select select_month= new Select(ddown_month);
   
   select_month.selectByVisibleText("May");


   WebElement ddown_year = driver.findElement(By.id("year"));
   Select select_year= new Select(ddown_year);
   
   select_year.selectByValue("1985");
   
   // sign up
   
   driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();

  driver.findElement(By.name("websubmit")).click();
  
  // registered message
  
  System.out.println("Sucessfully Registered");

}
}
