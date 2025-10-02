package Test_Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Scenerio002_SearchFun {



    WebDriver driver;

    @BeforeTest
    public void setUp() {
     
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSearchInputVisibility() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_target");

        // Switch to iframe
        driver.switchTo().frame("iframeResult");

        // Click "Visit W3Schools!" link
        WebElement link = driver.findElement(By.linkText("Visit W3Schools!"));
        link.click();

        // Switch to new tab
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }

        // Verify Search Box is visible
        WebElement searchBox = driver.findElement(By.id("search2"));
        Assert.assertTrue(searchBox.isDisplayed(), " Search input is not visible!");
        System.out.println("Search input is visible!");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
