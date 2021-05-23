package batch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//Launch the Browser
		
WebDriver driver = new ChromeDriver();

//Open Gmail Url in  the Browser

driver.get("https://www.gmail.com");

//Enter Email id

driver.findElement(By.id("identifierId")).sendKeys("softwaretestingrk");

//Click next button

driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span[1]/span[1]")).click();

Thread.sleep(3000);

//Enter password

driver.findElement(By.name("password")).sendKeys("6699mintu");

//Click next button

driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span[1]/span[1]")).click();


Thread.sleep(5000);

String url = driver.getCurrentUrl();

System.out.println(url);



//Verify the login process

if(url.contains("inbox")) {
	
	System.out.println("Test Case is Pass");
}

else
{
	System.out.println("Test Case is Fail");
}
	}

}
