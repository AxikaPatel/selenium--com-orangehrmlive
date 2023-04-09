package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_OrangehrmLive
{
    public static void main(String[] args)
    {
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(" https://opensource-demo.orangehrmlive.com/");

        //Maximise the browser
        driver.manage().window().maximize();

        //Give implicit wait time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Tile of the Page \t\t : " + driver.getTitle());

        //get the current URL
        System.out.println("Current URL \t\t\t : " + driver.getCurrentUrl());

        //Get the page Source
        System.out.println("Page Source \t\t\t : " + driver.getPageSource());

        //find the email field element
        driver.findElement(By.name("username")).sendKeys("Admin");

        //find the password element
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Close the browser
         driver.close();

    }
}
