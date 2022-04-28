package testsuits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestSuite extends Utility {
    String baseUrl = "https://www.amazon.co.uk/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void test() throws InterruptedException {
         clickOnElement(By.id("sp-cc-accept"));
        clickOnElement(By.xpath("//input[@id='twotabsearchtextbox']"));
         // clickOnElement(By.xpath("//span[@id='nav-search-submit-text']"));
        // getTextFromElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-iss-anchor']/div[@id='nav-flyout-searchAjax']/div[2]/div[2]/div[1]/div[1]"));
         //sendTextToElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-iss-anchor']/div[@id='nav-flyout-searchAjax']/div[2]/div[2]/div[1]/div[1]").("Dell Laptop"));
        // mouseHoverAndClick(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));
        //sendTextToElement((By.id("//input[@id='twotabsearchtextbox']"),"Dell Laptop");
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"), "Dell Laptop");
        //clickOnElement(By.id("//input[@id='nav-search-submit-button']"));
        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        clickOnElement(By.xpath("//li[@id='p_89/Dell']//span[@class='a-list-item']//a[@class='a-link-normal s-navigation-item']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label//i[@class='a-icon a-icon-checkbox']"));
        Thread.sleep(2000);
        List<WebElement> number = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        int actualnumber = number.size();
        System.out.println(actualnumber);
        for (WebElement webElement: number)
        {
         String name = webElement.getText();
            System.out.println(name);
        }


    }
        @After
        public void closeBrowser () {

        }

    }