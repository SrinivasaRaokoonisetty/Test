package Partner_Portal_VMP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page 
{

	public static void main(String[] args)
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://vmp-qa.azurewebsites.net/account/login");
		driver.manage().window().maximize();
		String Actual_Title=driver.getTitle();
		
		if(Actual_Title.equals("Vendor Management Portal - SageIT"))
		   {
			System.out.println(Actual_Title+"-->Title is matching");
	   	   }
		else
		   {
			System.out.println("Title is not matching");
		   }
			
		driver.findElement(By.id("email")).sendKeys("admin@root.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("123Pa$$word!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
				
driver.close();
	}

}
