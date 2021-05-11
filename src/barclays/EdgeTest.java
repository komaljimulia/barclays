package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk";//key to open web driver
        //most important step learn by heart for interview
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");//all small
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();//for maximize screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);//to open browser
        String title = driver.getTitle();//to get title
        driver.close();

    }
}