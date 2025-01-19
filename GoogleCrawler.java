import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleCrawler {


    public static void main(String[] args) {
        // System.setProperty("webdriver.gecko.driver", "/Users/farawa/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
        } catch (Exception e) {
            System.out.println("Couldn't get the webdriver");
            e.printStackTrace();
        }

        WebElement textArea = null;
        try {
            textArea = driver.findElement(By.tagName("textarea"));    
        } catch (Exception e) {
            System.out.println("Couldn't find the textarea element");
        } finally {
            textArea.sendKeys("inurl:\"cgi-bin/koha\"");
            textArea.sendKeys(Keys.RETURN);
            // WebElement search = driver.findElement(By.id("search_icon"));
            // try {
            //     WebElement svg = search.findElement(By.tagName("svg"));
            //     textArea.sendKeys(Keys.ENTER);
            //     textArea.sendKeys(Keys.ENTER);
            //     textArea.sendKeys(Keys.ENTER);
            // } catch (Exception e) {
            //     System.out.println("Couldn't press the search button");
            // }
            
        }

        WebElement results = null ;

        try {
            results = driver.findElement(By.id("rso"));
        } catch (Exception e) {
            System.out.println("Couldn't find the results of the search") ;
        } finally {
            List<WebElement> divs = results.findElements(By.tagName("div"));
            System.out.println("Number of <div> elements found: " + divs.size());
        }



    
    }
}