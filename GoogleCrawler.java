
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleCrawler {

    private WebDriver driver ;


    public static void main(String[] args) {
        System.out.println("Frabat habt rido");
        System.setProperty("webdriver.gecko.driver", "/Users/farawa/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

