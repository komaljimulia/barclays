package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk";//key to open web driver
        //most important step learn by heart for interview
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();//for maximize screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);//to open browser
        String title = driver.getTitle();//to get title
        boolean verifyTitle = title.equals("https://www.barclays.co.uk");
        boolean verifyTiteContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTiteContain);
        System.out.println(title);
        System.out.println(title.length());
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();

    }

}
